package view;

import java.util.List;

import dal.FresherDAL;
import entity.FresherCandidate;

public class Main {
	public static void main(String[] args) {
		FresherDAL fes = new FresherDAL();
		FresherCandidate fresetity = new FresherCandidate(3,"4","4",4,"4",4,"4","4","4","4","4");
		//List<FresherCandidate> list;
		//list = fes.getList("SELECT * FROM nhansu.candidate;");
		fes.insert(fresetity);
	
	}

}
