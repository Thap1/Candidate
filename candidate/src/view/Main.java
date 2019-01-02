package view;

import java.util.List;
import java.util.Scanner;
import org.apache.log4j.Logger;

import bll.ExperienceBLL;
import bll.FresherBLL;
import bll.InternBLL;
import entity.ExperienceCandidate;
import entity.FresherCandidate;
import entity.InternCandidate;

public class Main {
	static Logger log = Logger.getLogger(Main.class);
	static int choose = 0;
	static boolean conti = false;
	private static Scanner sc1;
	private static Scanner sc3;
	private static Scanner yn;
	private static Scanner sc12;
	private static Scanner sc32;
	private static Scanner sc13;
	private static Scanner sc33;
	private static Scanner yn2;

	public static void main(String[] args) {

		log.debug("Example debug message ..");
		log.info("Example info message ..");
		log.warn("Example warn message ..");
		log.error("Example error message ..");
		log.fatal("Example fatal message ..");
		System.out.println("Hệ Thống ... ");
		System.out.println("=============");
		showMenu();
	}

	/**
	 * Create by: HoangThap - CMC Create date: Jan 2, 2019 Modifier: HoangThap
	 * Modified date: Jan 2, 2019 Description: .... Version 1.0
	 */
	private static void showMenu() {
		Scanner sc = new Scanner(System.in);
		int chon = 0;
		do {
			System.out.println("Menu: ");
			System.out.println("1.Experience");
			System.out.println("2.Fresher");
			System.out.println("3.Intern");
			System.out.println("4.Exit!");
			System.out.println("-----------");
			do {
				System.out.println("Chọn chức năng : ");
				chon = sc.nextInt();
			} while (chon < 1 || chon > 4);
			switch (chon) {
			case 1:
				experience();
				break;
			case 2:
				fresher();
				break;
			case 3:
				intern();
				break;
			case 4:
				System.out.println("Đã Thoát !!!!!!");
				System.exit(0);
				break;

			}
		} while (chon != 4);

	}

	/**
	 * Create by: HoangThap - CMC Create date: Jan 2, 2019 Modifier: HoangThap
	 * Modified date: Jan 2, 2019 Description: .... Version 1.0
	 */
	private static void intern() {
		sc1 = new Scanner(System.in);
		do {
			System.out.println("1.Show ");
			System.out.println("2.Insert ");
			System.out.println("3.Exit");
			do {
				System.out.println("Ban Chon: ");
				choose = sc1.nextInt();
			} while (choose < 1 || choose > 3);
			List<InternCandidate> listIntern;
			InternBLL internBLL = new InternBLL();
			InternCandidate intern = new InternCandidate();
			sc3 = new Scanner(System.in);
			switch (choose) {
			case 1:
				System.out.println("== List Intern ==");
				listIntern = internBLL.getList("SELECT * FROM nhansu.candidate where candidateType = '2';");
				internBLL.show(listIntern);
				break;
			case 2:
				System.out.println("== Insert Intern ==");
				System.out.println("-CandidateID: ");
				int candi = sc1.nextInt();
				System.out.println("-FirstName: ");
				String firstNames = sc1.next();
				System.out.println("-LastName: ");
				String lastNames = sc1.next();
				System.out.println("-BirthDate: ");
				int birthDate = sc1.nextInt();
				System.out.println("-Address: ");
				String addres = sc1.next();
				System.out.println("-Phone: ");
				int phones = sc1.nextInt();
				System.out.println("-Email: ");
				String emails = sc1.next();

				System.out.println("-Majors: ");
				String majors = sc1.next();
				System.out.println("-Semester: ");
				String semeter = sc1.next();
				System.out.println("-UniversityName: ");
				String uni = sc1.next();

				intern.setCandidateID(candi);
				intern.setFirstName(firstNames);
				intern.setLastName(lastNames);
				// check 4 chữ số nguyên(1900..Current Year)
				if (CheckValidation.checkBirthDate(birthDate)) {
					intern.setBirtDate(birthDate);
				} else {
					System.out.println("Incorrect input for birthdate");
					showMenu();
				}

				intern.setAddress(addres);
				//check Tối thiểu 7 chữ số nguyên dương
				if (CheckValidation.checkPhoneNumber(phones)) {
					intern.setPhone(phones);
				} else {
					System.out.println("Incorrect for input phone number");
					showMenu();
				}
				
				if (CheckValidation.checkEmail(emails)) {
					intern.setEmail(emails);
            } else {
                    System.out.println("Incorrect for input email");
                    showMenu();
            }
				intern.setCandidateType("2");
				intern.setMajors(majors);
				intern.setSemester(semeter);
				intern.setUniversityName(uni);

				internBLL.insert(intern);
				break;
			case 3:
				System.out.println("Đã Thoát!!!!!!!!");
				System.exit(0);
				break;
			}
			System.out.println("Bạn muốn tiếp tục không (Y/N): ");

			yn = new Scanner(System.in);
			String check = yn.nextLine();
			if ("y".equals(check)) {
				conti = false;
			} else {
				conti = true;
			}
		} while (!conti);
	}

	/**
	 * Create by: HoangThap - CMC Create date: Jan 2, 2019 Modifier: HoangThap
	 * Modified date: Jan 2, 2019 Description: .... Version 1.0
	 */
	private static void fresher() {
		sc12 = new Scanner(System.in);
		do {
			System.out.println("1.Show ");
			System.out.println("2.Insert ");
			System.out.println("3.Exit");
			do {
				System.out.println("Ban Chon: ");
				choose = sc12.nextInt();
			} while (choose < 1 || choose > 3);
			List<FresherCandidate> listIntern;
			FresherBLL fresherBLL = new FresherBLL();
			FresherCandidate fres = new FresherCandidate();
			sc32 = new Scanner(System.in);
			switch (choose) {
			case 1:
				System.out.println("== List Fresher ==");
				listIntern = fresherBLL.getList("SELECT * FROM nhansu.candidate where candidateType = '1';");
				fresherBLL.show(listIntern);
				break;
			case 2:
				System.out.println("== Insert Intern ==");
				System.out.println("-CandidateID: ");
				int candi = sc12.nextInt();
				System.out.println("-FirstName: ");
				String firstNames = sc12.next();
				System.out.println("-LastName: ");
				String lastNames = sc12.next();
				System.out.println("-BirthDate: ");
				int birthdate = sc12.nextInt();
				System.out.println("-Address: ");
				String addres = sc12.next();
				System.out.println("-Phone: ");
				int phones = sc12.nextInt();
				System.out.println("-Email: ");
				String emails = sc12.next();

				System.out.println("-GraduationDate: ");
				String graDate = sc12.next();
				System.out.println("-GraduationRank: ");
				String graRank = sc12.next();
				System.out.println("-Education: ");
				String edu = sc12.next();

				fres.setCandidateID(candi);
				fres.setFirstName(firstNames);
				fres.setLastName(lastNames);
				fres.setBirtDate(birthdate);
				fres.setAddress(addres);
				fres.setPhone(phones);
				fres.setEmail(emails);
				fres.setCandidateType("1");
				fres.setGraduationDate(graDate);
				fres.setGraduationRank(graRank);
				fres.setEducation(edu);

				fresherBLL.insert(fres);
				break;
			case 3:
				System.out.println("Đã Thoát!!!!!!!!");
				System.exit(0);
				break;
			}
			System.out.println("Bạn muốn tiếp tục không (Y/N): ");

			Scanner yn = new Scanner(System.in);
			String check = yn.nextLine();
			if ("y".equals(check)) {
				conti = false;
			} else {
				conti = true;
			}
		} while (!conti);
	}

	/**
	 * Create by: HoangThap - CMC Create date: Jan 2, 2019 Modifier: HoangThap
	 * Modified date: Jan 2, 2019 Description: .... Version 1.0
	 */
	private static void experience() {
		sc13 = new Scanner(System.in);
		do {
			System.out.println("1.Show ");
			System.out.println("2.Insert ");
			System.out.println("3.Exit");
			do {
				System.out.println("Ban Chon: ");
				choose = sc13.nextInt();
			} while (choose < 1 || choose > 3);
			List<ExperienceCandidate> listExp;
			ExperienceBLL expBLL = new ExperienceBLL();
			ExperienceCandidate exp = new ExperienceCandidate();
			sc33 = new Scanner(System.in);
			switch (choose) {
			case 1:
				System.out.println("== List Fresher ==");
				listExp = expBLL.getList("SELECT * FROM nhansu.candidate where candidateType = '0';");
				expBLL.show(listExp);
				break;
			case 2:
				System.out.println("== Insert Intern ==");
				System.out.println("-CandidateID: ");
				int candi = sc13.nextInt();
				System.out.println("-FirstName: ");
				String firstNames = sc13.next();
				System.out.println("-LastName: ");
				String lastNames = sc13.next();
				System.out.println("-BirthDate: ");
				int birthdate = sc13.nextInt();
				System.out.println("-Address: ");
				String addres = sc13.next();
				System.out.println("-Phone: ");
				int phones = sc13.nextInt();
				System.out.println("-Email: ");
				String emails = sc13.next();

				System.out.println("-ExpInYear: ");
				int expInYear = Integer.parseInt(sc13.next());
				System.out.println("-ProSkill: ");
				String pro = sc13.next();

				exp.setCandidateID(candi);
				exp.setFirstName(firstNames);
				exp.setLastName(lastNames);
				exp.setBirtDate(birthdate);
				exp.setAddress(addres);
				exp.setPhone(phones);
				exp.setEmail(emails);
				exp.setCandidateType("0");
				
				if (CheckValidation.checkExpInYear(expInYear)) {
					//exp.setExpInYear(expInYear);
            } else {
                    System.out.println("Incorrect for input exp in year");
                   showMenu();
            }
				exp.setProSkill(pro);

				expBLL.insert(exp);
				break;
			case 3:
				System.out.println("Đã Thoát!!!!!!!!");
				System.exit(0);
				break;
			}
			System.out.println("Bạn muốn tiếp tục không (Y/N): ");

			yn2 = new Scanner(System.in);
			String check = yn2.nextLine();
			if ("y".equals(check)) {
				conti = false;
			} else {
				conti = true;
			}
		} while (!conti);
	}

}
