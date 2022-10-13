package costumeHire;

import java.util.ArrayList;
import java.util.List;

public class HireRegister {
	protected List<CostumeHire> hireLog;
	

	public HireRegister() {
		hireLog = new ArrayList<CostumeHire>();
	}

	/**
	 * Add a new hire to the Hire Register
	 * @param hire The new hire
	 */
	public void addHire(CostumeHire newHire) {
		hireLog.add(newHire);
	}
	
	public void endHire(CostumeHire existingHire)
	{
		existingHire.endHire(0);
	}

	/**
	 * Find the index of a particular hire object in the hire register
	 * @param hireID The hire ID reference for the hire
	 * @return The index of the hire object in the hire register
	 */
	public int findHireIndex(int hireID) {
		CostumeHire foundHire = findHire(hireID);
		if(foundHire==null)
			return -1;
		else
			return hireLog.indexOf(foundHire);
	}
	
	/**
	 * Find the Hire object for a particular hireID
	 * @param hireID The hire ID reference for the hire
	 * @return The hire object
	 */
	public CostumeHire findHire(int hireID) {
		for(CostumeHire oneHire : hireLog) {
			if(oneHire.getHireID() == hireID)
				return oneHire;
			}
		return null;
	}


	
	public List<Costume> getAllCostumeHires()
	{
		List<Costume> allCostumeHires = new ArrayList<Costume>();
		for (CostumeHire h : hireLog) {
			allCostumeHires.add(h.getCostume());
		}
		return allCostumeHires;
	}
	
	public String printHireRegister () {
		String hireList = "Hire Register: \n";
		for(CostumeHire h : hireLog) {
			hireList = hireList + h.toString() + "\n";
			}
		
		return hireList;
	}


}
