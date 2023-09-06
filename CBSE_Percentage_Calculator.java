import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

class ten {
    Scanner sc = new Scanner(System.in);
    FileWriter fw;

    {
        try {
            fw = new FileWriter("class10.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void marks10() {
        try {
            System.out.print("Enter the marks of Mathematics: ");
            int maths = sc.nextInt();
            System.out.print("Enter the marks of Science: ");
            int science = sc.nextInt();
            System.out.print("Enter the marks of Social Science: ");
            int sst = sc.nextInt();
            System.out.print("Enter the marks of English: ");
            int eng = sc.nextInt();
            System.out.print("Enter the marks of Hindi/Sanskrit: ");
            int hinSan = sc.nextInt();
            if (maths > 100 || science > 100 || sst > 100 || eng > 100 || hinSan > 100) {
                System.out.println("You have entered a marks which is greater than 100");
                System.exit(0);
            }
            float per = (float) (maths + science + sst + eng + hinSan) / 5;
            System.out.printf("Your percentage is: %.2f.\n", per);
            fw.write("Mathematics --> " + maths + "\nScience --> " + science + "\nSocial Science --> " + sst + "\nEnglish --> " + eng + "\nHindi/Sanskrit --> " + hinSan);
            fw.write("\nPercentage --> " + per + "%");
            if (per >= 33 && maths >= 33 && science >= 33 && sst >= 33 && eng >= 33 && hinSan >= 33) {
                System.out.println("Congratulation, you have passed.");
                fw.write("\nCongratulation, you have passed.");
            } else {
                System.out.println("Sorry, you failed! TRY HARDER");
                fw.write("\nSorry, you failed! TRY HARDER");
            }
            fw.close();
        } catch (InputMismatchException ex) {
            System.out.println("You have given a wrong input.\nError --> " + ex);
        } catch (Exception e) {
            System.out.println("Error --> " + e);
        }
    }
}

class twelve {
    Scanner sc = new Scanner(System.in);
    FileWriter fw;

    {
        try {
            fw = new FileWriter("class12.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void marks12() {
        try {
            System.out.print("Enter your stream Science/Commerce/Arts (S/C/A): ");
            String sca = sc.next();
            if (sca.equalsIgnoreCase("S")) {
                System.out.print("Enter the your Science stream --> PCM/PCB/PCB+M: ");
                String h = sc.next();
                if (h.equalsIgnoreCase("PCM")) {
                    System.out.print("Enter the marks of Physics: ");
                    int phy = sc.nextInt();
                    System.out.print("Enter the marks of Chemistry: ");
                    int chem = sc.nextInt();
                    System.out.print("Enter the marks of Mathematics: ");
                    int maths = sc.nextInt();
                    System.out.print("Enter the marks of English: ");
                    int eng = sc.nextInt();
                    System.out.println("If you don't have an extra subject, write 'NONE' in name the of the subject and '0' in the marks of the subject.");
                    System.out.print("Enter your the name of the extra subject: ");
                    String m = sc.next();
                    System.out.print("Enter the marks of " + m + ": ");
                    int n = sc.nextInt();
                    if (n > 0) {
                        if (phy > 100 || chem > 100 || maths > 100 || eng > 100 || n > 100) {
                            System.out.println("You have entered a marks which is greater than 100");
                            System.exit(0);
                        }
                        float per1 = (float) (phy + chem + maths + eng + n) / 5;
                        System.out.printf("Your percentage is: %.2f.\n", per1);
                        fw.write("Physics --> " + phy + "\nChemistry --> " + chem + "\nMathematics --> " + maths + "\nEnglish --> " + eng + "\n" + m + " --> " + n);
                        fw.write("\nPercentage --> " + per1 + "%");
                        if (per1 >= 33 && phy >= 33 && chem >= 33 && maths >= 33 && eng >= 33 && n >= 33) {
                            System.out.println("Congratulation, you have passed.");
                            fw.write("\nCongratulation, you have passed.");
                        } else {
                            System.out.println("Sorry, you failed! TRY HARDER");
                            fw.write("\nSorry, you failed! TRY HARDER");
                        }
                    } else if (n == 0) {
                        if (phy > 100 || chem > 100 || maths > 100 || eng > 100) {
                            System.out.println("You have entered a marks which is greater than 100");
                            System.exit(0);
                        }
                        float per1 = (float) (phy + chem + maths + eng) / 5;
                        System.out.printf("Your percentage is: %.2f.\n", per1);
                        fw.write("Physics --> " + phy + "\nChemistry --> " + chem + "\nMathematics --> " + maths + "\nEnglish --> " + eng);
                        fw.write("\nPercentage --> " + per1 + "%");
                        if (per1 >= 33 && phy >= 33 && chem >= 33 && maths >= 33 && eng >= 33) {
                            System.out.println("Congratulation, you have passed.");
                            fw.write("\nCongratulation, you have passed.");
                        } else {
                            System.out.println("Sorry, you failed! TRY HARDER");
                            fw.write("\nSorry, you failed! TRY HARDER");
                        }
                    } else {
                        System.out.println("You have given a wrong input.");
                    }
                } else if (h.equalsIgnoreCase("PCB")) {
                    System.out.print("Enter the marks of Physics: ");
                    int phy = sc.nextInt();
                    System.out.print("Enter the marks of Chemistry: ");
                    int chem = sc.nextInt();
                    System.out.print("Enter the marks of Biology: ");
                    int bio = sc.nextInt();
                    System.out.print("Enter the marks of English: ");
                    int eng = sc.nextInt();
                    System.out.println("If you don't have an extra subject, write 'NONE' in name the of the subject and '0' in the marks of the subject.");
                    System.out.print("Enter your the name of the extra subject: ");
                    String t = sc.next();
                    System.out.print("Enter the marks of " + t + ": ");
                    int u = sc.nextInt();
                    if (u > 0) {
                        if (phy > 100 || chem > 100 || bio > 100 || eng > 100 || u > 100) {
                            System.out.println("You have entered a marks which is greater than 100");
                            System.exit(0);
                        }
                        float per2 = (float) (phy + chem + bio + eng + u) / 5;
                        System.out.printf("Your percentage is: %.2f.\n", per2);
                        fw.write("Physics --> " + phy + "\nChemistry --> " + chem + "\nBiology --> " + bio + "\nEnglish --> " + eng + "\n" + t + " --> " + u);
                        fw.write("\nPercentage --> " + per2 + "%");
                        if (per2 >= 33 && phy >= 33 && chem >= 33 && bio >= 33 && eng >= 33 && u >= 33) {
                            System.out.println("Congratulation, you have passed.");
                            fw.write("\nCongratulation, you have passed.");
                        } else {
                            System.out.println("Sorry, you failed! TRY HARDER");
                            fw.write("\nSorry, you failed! TRY HARDER");
                        }
                    } else if (u == 0) {
                        if (phy > 100 || chem > 100 || bio > 100 || eng > 100) {
                            System.out.println("You have entered a marks which is greater than 100");
                            System.exit(0);
                        }
                        float per2 = (float) (phy + chem + bio + eng) / 5;
                        System.out.printf("Your percentage is: %.2f.\n", per2);
                        fw.write("Physics --> " + phy + "\nChemistry --> " + chem + "\nBiology --> " + bio + "\nEnglish --> " + eng);
                        fw.write("\nPercentage --> " + per2 + "%");
                        if (per2 >= 33 && phy >= 33 && chem >= 33 && bio >= 33 && eng >= 33) {
                            System.out.println("Congratulation, you have passed.");
                            fw.write("\nCongratulation, you have passed.");
                        } else {
                            System.out.println("Sorry, you failed! TRY HARDER");
                            fw.write("\nSorry, you failed! TRY HARDER");
                        }
                    } else {
                        System.out.println("You have given a wrong input.");
                    }
                } else if (h.equalsIgnoreCase("PCB+M")) {
                    System.out.print("Enter the marks of Physics: ");
                    int phy = sc.nextInt();
                    System.out.print("Enter the marks of Chemistry: ");
                    int chem = sc.nextInt();
                    System.out.print("Enter the marks of Biology: ");
                    int bio = sc.nextInt();
                    System.out.print("Enter the marks of Mathematics: ");
                    int maths = sc.nextInt();
                    System.out.print("Enter the marks of English: ");
                    int eng = sc.nextInt();
                    System.out.println("If you don't have an extra subject, write 'NONE' in name the of the subject and '0' in the marks of the subject.");
                    System.out.print("Enter your the name of the extra subject: ");
                    String a1 = sc.next();
                    System.out.print("Enter the marks of " + a1 + ": ");
                    int b1 = sc.nextInt();
                    if (b1 > 0) {
                        if (phy > 100 || chem > 100 || bio > 100 || maths > 100 || eng > 100 || b1 > 100) {
                            System.out.println("You have entered a marks which is greater than 100");
                            System.exit(0);
                        }
                        float per3 = (float) (phy + chem + bio + maths + eng + b1) / 6;
                        System.out.printf("Your percentage is: %.2f.\n", per3);
                        fw.write("Physics --> " + phy + "\nChemistry --> " + chem + "\nBiology --> " + bio + "\nMathematics --> " + maths + "\nEnglish --> " + eng + "\n" + a1 + " --> " + b1);
                        fw.write("\nPercentage --> " + per3 + "%");
                        if (per3 >= 33 && phy >= 33 && chem >= 33 && bio >= 33 && maths >= 33 && eng >= 33 && b1 >= 33) {
                            System.out.println("Congratulation, you have passed.");
                            fw.write("\nCongratulation, you have passed.");
                        } else {
                            System.out.println("Sorry, you failed! TRY HARDER");
                            fw.write("\nSorry, you failed! TRY HARDER");
                        }
                    } else if (b1 == 0) {
                        if (phy > 100 || chem > 100 || bio > 100 || maths > 100 || eng > 100) {
                            System.out.println("You have entered a marks which is greater than 100");
                            System.exit(0);
                        }
                        float per3 = (float) (phy + chem + bio + maths + eng) / 6;
                        System.out.printf("Your percentage is: %.2f.\n", per3);
                        fw.write("Physics --> " + phy + "\nChemistry --> " + chem + "\nBiology --> " + bio + "\nMathematics --> " + maths + "\nEnglish --> " + eng);
                        fw.write("\nPercentage --> " + per3 + "%");
                        if (per3 >= 33 && phy >= 33 && chem >= 33 && bio >= 33 && maths >= 33 && eng >= 33) {
                            System.out.println("Congratulation, you have passed.");
                            fw.write("\nCongratulation, you have passed.");
                        } else {
                            System.out.println("Sorry, you failed! TRY HARDER");
                            fw.write("\nSorry, you failed! TRY HARDER");
                        }
                    } else {
                        System.out.println("You have given a wrong input.");
                    }
                } else {
                    System.out.println("You have given a wrong input.");
                }
            } else if (sca.equalsIgnoreCase("C")) {
                System.out.print("Do you have Mathematics (Yes/No): ");
                String ask = sc.next();
                if (ask.equalsIgnoreCase("Yes")) {
                    System.out.print("Enter the marks of Accountancy: ");
                    int acct = sc.nextInt();
                    System.out.print("Enter the marks of Economics: ");
                    int eco = sc.nextInt();
                    System.out.print("Enter the marks of Business Studies: ");
                    int bst = sc.nextInt();
                    System.out.print("Enter the marks of English: ");
                    int eng = sc.nextInt();
                    System.out.print("Enter the marks of Mathematics: ");
                    int maths = sc.nextInt();
                    System.out.println("If you don't have an extra subject, write 'NONE' in name the of the subject and '0' in the marks of the subject.");
                    System.out.print("Enter your the name of the extra subject: ");
                    String h1 = sc.next();
                    System.out.print("Enter the marks of " + h1 + ": ");
                    int i1 = sc.nextInt();
                    if (i1 > 0) {
                        if (acct > 100 || eco > 100 || bst > 100 || eng > 100 || maths > 100 || i1 > 100) {
                            System.out.println("You have entered a marks which is greater than 100");
                            System.exit(0);
                        }
                        float per4 = (float) (acct + eco + bst + eng + maths + i1) / 6;
                        System.out.printf("Your percentage is: %.2f.\n", per4);
                        fw.write("Accountancy --> " + acct + "\nEconomics --> " + eco + "\nBusiness Studies --> " + bst + "\nEnglish --> " + eng + "\nMathematics -->" + maths + "\n" + h1 + " --> " + i1);
                        fw.write("\nPercentage --> " + per4 + "%");
                        if (per4 >= 33 && acct >= 33 && eco >= 33 && bst >= 33 && eng >= 33 && maths >= 33 && i1 >= 33) {
                            System.out.println("Congratulation, you have passed.");
                            fw.write("\nCongratulation, you have passed.");
                        } else {
                            System.out.println("Sorry, you failed! TRY HARDER");
                            fw.write("\nSorry, you failed! TRY HARDER");
                        }
                    } else if (i1 == 0) {
                        if (acct > 100 || eco > 100 || bst > 100 || eng > 100 || maths > 100) {
                            System.out.println("You have entered a marks which is greater than 100");
                            System.exit(0);
                        }
                        float per4 = (float) (acct + eco + bst + eng + maths) / 6;
                        System.out.printf("Your percentage is: %.2f.\n", per4);
                        fw.write("Accountancy --> " + acct + "\nEconomics --> " + eco + "\nBusiness Studies --> " + bst + "\nEnglish --> " + eng + "\nMathematics -->" + maths);
                        fw.write("\nPercentage --> " + per4 + "%");
                        if (per4 >= 33 && acct >= 33 && eco >= 33 && bst >= 33 && eng >= 33 && maths >= 33) {
                            System.out.println("Congratulation, you have passed.");
                            fw.write("\nCongratulation, you have passed.");
                        } else {
                            System.out.println("Sorry, you failed! TRY HARDER");
                            fw.write("\nSorry, you failed! TRY HARDER");
                        }
                    } else {
                        System.out.println("You have given a wrong input.");
                    }
                } else if (ask.equalsIgnoreCase("No")) {
                    System.out.print("Enter the marks of Accountancy: ");
                    int acct = sc.nextInt();
                    System.out.print("Enter the marks of Economics: ");
                    int eco = sc.nextInt();
                    System.out.print("Enter the marks of Business Studies: ");
                    int bst = sc.nextInt();
                    System.out.print("Enter the marks of English: ");
                    int eng = sc.nextInt();
                    System.out.println("If you don't have an extra subject, write 'NONE' in name the of the subject and '0' in the marks of the subject.");
                    System.out.print("Enter your the name of the extra subject: ");
                    String h12 = sc.next();
                    System.out.print("Enter the marks of " + h12 + ": ");
                    int i12 = sc.nextInt();
                    if (i12 > 0) {
                        if (acct > 100 || eco > 100 || bst > 100 || eng > 100 || i12 > 100) {
                            System.out.println("You have entered a marks which is greater than 100");
                            System.exit(0);
                        }
                        float per42 = (float) (acct + eco + bst + eng + i12) / 6;
                        System.out.printf("Your percentage is: %.2f.\n", per42);
                        fw.write("Accountancy --> " + acct + "\nEconomics --> " + eco + "\nBusiness Studies --> " + bst + "\nEnglish --> " + eng + "\n" + h12 + " --> " + i12);
                        fw.write("\nPercentage --> " + per42 + "%");
                        if (per42 >= 33 && acct >= 33 && eco >= 33 && bst >= 33 && eng >= 33 && i12 >= 33) {
                            System.out.println("Congratulation, you have passed.");
                            fw.write("\nCongratulation, you have passed.");
                        } else {
                            System.out.println("You have given a wrong input.");
                            fw.write("\nSorry, you failed! TRY HARDER");
                        }
                    } else if (i12 == 0) {
                        if (acct > 100 || eco > 100 || bst > 100 || eng > 100) {
                            System.out.println("You have entered a marks which is greater than 100");
                            System.exit(0);
                        }
                        float per42 = (float) (acct + eco + bst + eng) / 6;
                        System.out.printf("Your percentage is: %.2f.\n", per42);
                        fw.write("Accountancy --> " + acct + "\nEconomics --> " + eco + "\nBusiness Studies --> " + bst + "\nEnglish --> " + eng);
                        fw.write("\nPercentage --> " + per42 + "%");
                        if (per42 >= 33 && acct >= 33 && eco >= 33 && bst >= 33 && eng >= 33) {
                            System.out.println("Congratulation, you have passed.");
                            fw.write("\nCongratulation, you have passed.");
                        } else {
                            System.out.println("You have given a wrong input.");
                            fw.write("\nSorry, you failed! TRY HARDER");
                        }
                    } else {
                        System.out.println("You have given a wrong input.");
                    }
                } else {
                    System.out.println("You have given a wrong input.");
                }
            } else if (sca.equalsIgnoreCase("A")) {
                System.out.print("Enter the marks of History: ");
                int his = sc.nextInt();
                System.out.print("Enter the marks of Economics: ");
                int eco = sc.nextInt();
                System.out.print("Enter the marks of Geography: ");
                int geo = sc.nextInt();
                System.out.print("Enter the marks of English: ");
                int eng = sc.nextInt();
                System.out.print("Enter the marks of Political Science: ");
                int polSci = sc.nextInt();
                System.out.print("Enter the marks of Psychology: ");
                int psy = sc.nextInt();
                System.out.print("Enter the marks of Sociology: ");
                int soci = sc.nextInt();
                System.out.println("If you don't have an extra subject, write 'NONE' in name the of the subject and '0' in the marks of the subject.");
                System.out.print("Enter your the name of the extra subject: ");
                String q1 = sc.next();
                System.out.print("Enter the marks of " + q1 + ": ");
                int r1 = sc.nextInt();
                if (r1 > 0) {
                    if (his > 100 || eco > 100 || geo > 100 || eng > 100 || polSci > 100 || psy > 100 || soci > 100 || r1 > 100) {
                        System.out.println("You have entered a marks which is greater than 100");
                        System.exit(0);
                    }
                    float per5 = (float) (his + eco + geo + eng + polSci + psy + soci + r1) / 8;
                    System.out.printf("Your percentage is: %.2f.\n", per5);
                    fw.write("History --> " + his + "\nEconomics --> " + eco + "\nGeography --> " + geo + "\nEnglish --> " + eng + "\nPolitical Science --> " + polSci + "\nPsychology --> " + psy + "\nSociology --> " + soci + "\n" + q1 + " --> " + r1);
                    fw.write("\nPercentage --> " + per5 + "%");
                    if (per5 >= 33 && his >= 33 && eco >= 33 && geo >= 33 && eng >= 33 && polSci >= 33 && psy >= 33 && soci >= 33 && r1 >= 33) {
                        System.out.println("Congratulation, you have passed.");
                        fw.write("\nCongratulation, you have passed.");
                    } else {
                        System.out.println("Sorry, you failed! TRY HARDER");
                        fw.write("\nSorry, you failed! TRY HARDER");
                    }
                } else if (r1 == 0) {
                    if (his > 100 || eco > 100 || geo > 100 || eng > 100 || polSci > 100 || psy > 100 || soci > 100) {
                        System.out.println("You have entered a marks which is greater than 100");
                        System.exit(0);
                    }
                    float per5 = (float) (his + eco + geo + eng + polSci + psy + soci) / 8;
                    System.out.printf("Your percentage is: %.2f.\n", per5);
                    fw.write("History --> " + his + "\nEconomics --> " + eco + "\nGeography --> " + geo + "\nEnglish --> " + eng + "\nPolitical Science --> " + polSci + "\nPsychology --> " + psy + "\nSociology --> " + soci);
                    fw.write("\nPercentage --> " + per5 + "%");
                    if (per5 >= 33 && his >= 33 && eco >= 33 && geo >= 33 && eng >= 33 && polSci >= 33 && psy >= 33 && soci >= 33) {
                        System.out.println("Congratulation, you have passed.");
                        fw.write("\nCongratulation, you have passed.");
                    } else {
                        System.out.println("Sorry, you failed! TRY HARDER");
                        fw.write("\nSorry, you failed! TRY HARDER");
                    }
                } else {
                    System.out.println("You have given a wrong input.");
                }
            } else {
                System.out.println("You have given a wrong input.");
            }
            fw.close();
        } catch (InputMismatchException ex) {
            System.out.println("You have given a wrong input.\nError --> " + ex);
        } catch (Exception e) {
            System.out.println("Error --> " + e);
        }
    }
}

public class CBSE_Percentage_Calculator {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("********** CBSE Percentage Calculator **********");
            Calendar cal = Calendar.getInstance();
            System.out.println(cal.getTime());
            System.out.print("Enter your class 10/12: ");
            int a = sc.nextInt();
            ten t10 = new ten();
            twelve t12 = new twelve();
            if (a == 10) {
                t10.marks10();
                System.out.println("Details has been saved in class10.txt");
            } else if (a == 12) {
                t12.marks12();
                System.out.println("Details has been saved in class12.txt");
            } else {
                System.out.println("You have a wrong inout.");
            }
        } catch (InputMismatchException ex) {
            System.out.println("You have a wrong inout.\nError --> " + ex);
        } catch (Exception e) {
            System.out.println("Error --> " + e);
        } finally {
            System.out.println("\n********** Wish you good luck for you future. **********");
        }
    }
}
