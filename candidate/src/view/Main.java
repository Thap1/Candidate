package view;

import java.util.List;
import java.util.Scanner;
import org.apache.log4j.Logger;

import bll.InternBLL;
import entity.InternCandidate;

public class Main {
    static Logger log = Logger.getLogger(Main.class);
    static int choose = 0;
    static boolean conti = false;

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
        Scanner sc1 = new Scanner(System.in);
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
            switch (choose) {
            case 1:
                System.out.println("== List Intern ==");
                listIntern = internBLL.getList("SELECT * FROM nhansu.candidate where candidateType = '2';");
                internBLL.show(listIntern);
                break;
            case 2:
                System.out.println("== Insert Intern ==");
                final Scanner sc3 = new Scanner(System.in);
                System.out.println("-CandidateID: ");
                int candi = sc3.nextInt();
                Scanner sc32 = new Scanner(System.in);
                System.out.println("-FirstName: ");
                String firstNames = sc32.nextLine();
                System.out.println("-LastName: ");
                String lastNames = sc3.nextLine();
                System.out.println("-BirthDate: ");
                int birthdate = sc3.nextInt();
                System.out.println("-Address: ");
                String addres = sc3.nextLine();
                System.out.println("-Phone: ");
                int phones = sc3.nextInt();
                System.out.println("-Email: ");
                String emails = sc3.nextLine();
                System.out.println("-CandidateType((0: Experience_, 1: Fresher_ candidate , 2: Intern_candidate)): ");
                String candiType = sc3.nextLine();
                System.out.println("-Majors: ");
                String majors = sc3.nextLine();
                System.out.println("-Semester: ");
                String semeter = sc3.nextLine();
                System.out.println("-UniversityName: ");
                String uni = sc3.nextLine();
                
                intern.setCandidateID(candi);
                intern.setFirstName(firstNames);
                intern.setLastName(lastNames);
                intern.setBirtDate(birthdate);
                intern.setAddress(addres);
                intern.setPhone(phones);
                intern.setEmail(emails);
                intern.setCandidateType(candiType);
                intern.setMajors(majors);
                intern.setSemester(semeter);
                intern.setUniversityName(uni);
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
    private static void fresher() {
        // TODO Auto-generated method stub

    }

    /**
     * Create by: HoangThap - CMC Create date: Jan 2, 2019 Modifier: HoangThap
     * Modified date: Jan 2, 2019 Description: .... Version 1.0
     */
    private static void experience() {
        // TODO Auto-generated method stub

    }

}
