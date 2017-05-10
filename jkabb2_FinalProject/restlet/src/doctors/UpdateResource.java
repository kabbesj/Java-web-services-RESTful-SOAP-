package doctors;

import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.data.Status;
import org.restlet.data.MediaType;
import org.restlet.data.Form;

public class UpdateResource extends ServerResource {
    public UpdateResource() { }

    @Put
    public Representation update(Representation data) {
	Status status = null;
	String msg = null;

	// Extract the data from the POST body.
	Form form = new Form(data);
	String sid = form.getFirstValue("id");
	String doctor = form.getFirstValue("doctor");

	if (sid == null || doctor == null) {
	    msg = "An ID and new doctor must be provided.\n";
	    status = Status.CLIENT_ERROR_BAD_REQUEST;
	}
	else {
	    int id = Integer.parseInt(sid.trim());
	    Patient patient = Patients.find(id);
	    if (patient == null) {
		msg = "There is no doctor with ID " + id + "\n";
		status = Status.CLIENT_ERROR_BAD_REQUEST;
	    }
	    else {
		patient.setWords(doctor);
		
		msg = "Patient class instance ID #:" + id + " has been updated to '" + doctor + "'.\n";
		status = Status.SUCCESS_OK;
	    }
	}

	setStatus(status);
	return new StringRepresentation(msg, MediaType.TEXT_PLAIN);
    }
}


