package doctors;

import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.data.Status;
import org.restlet.data.MediaType;
import org.restlet.data.Form;

public class CreateResource extends ServerResource {
    public CreateResource() { }

    @Post
    public Representation create(Representation data) {
	Status status = null;
	String msg = null;

	// Extract the data from the POST body.
	Form form = new Form(data);
	String doctor = form.getFirstValue("doctor");

	if (doctor == null) {
	    msg = "No doctor were given for the patient.\n";
	    status = Status.CLIENT_ERROR_BAD_REQUEST;
	}
	else {
	    Patients.add(doctor);
	    msg = "The doctor'" + doctor + "' has been added.\n";
	    status = Status.SUCCESS_OK;
	}

	setStatus(status);
	return new StringRepresentation(msg, MediaType.TEXT_PLAIN);
    }
}


