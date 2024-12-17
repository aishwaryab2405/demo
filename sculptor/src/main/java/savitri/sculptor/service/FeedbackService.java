package savitri.sculptor.service;

import java.util.List;

import savitri.sculptor.model.Feedback;
import savitri.sculptor.model.Registration;

public interface FeedbackService {
	Feedback insertrecord(Feedback r);
	List<Feedback> getAll();
	void del (int ri);
	Feedback updaterecord(int i,Feedback r);

}
