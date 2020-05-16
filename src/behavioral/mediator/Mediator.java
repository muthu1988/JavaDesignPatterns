package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

class Mediator {
	private List<Participant> participants = new ArrayList<>();

	public void broadCast(Participant sender, int val) {
		for (Participant p : participants) {
			if (!p.equals(sender)) {
				p.value = val;
			}
		}
	}

	public void addParticipant(Participant p) {
		participants.add(p);
	}

	public List<Participant> getParticipants() {
		return participants;
	}

}