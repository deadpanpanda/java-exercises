
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("See included README.md for instructions.");

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your filing status:");
        int filingStatus = myObj.nextInt();
        System.out.println("Enter your taxable income:");
        int income = myObj.nextInt();
        double tax = 0d;

        if (filingStatus == 0) {
            if (income > 8350) {
                tax += 835;
                if (income > 33950) {
                    tax += 3840;
                    if (income > 82250) {
                        tax += 12075;
                        if (income > 171550) {
                            tax += 25004;
                            if (income > 372950) {
                                tax += 66462;
                                if (income > 372951) {
                                    tax += ((income - 372950) * 0.35);
                                } else {
                                    tax += ((income - 372950) * 0.35);
                                }
                            } else {
                                tax += ((income - 171550) * 0.33);
                            }
                        } else {
                            tax += ((income - 82250) * 0.28);
                        }
                    } else {
                        tax += ((income - 33950) * 0.25);
                    }
                } else {
                    tax += ((income - 8350) * 0.15);
                }
            } else {
                tax += income * 0.10;
            }
            System.out.println("Your tax is: " + tax);
        }

        if (filingStatus == 1) {
            if (income > 16700) {
                tax += 1670;
                if (income > 67900) {
                    tax += 7680;
                    if (income > 137050) {
                        tax += 17287.5;
                        if (income > 208850) {
                            tax += 20104;
                            if (income > 372950) {
                                tax += 54153;
                                if (income > 372951) {
                                    tax += ((income - 372950) * 0.35);
                                } else {
                                    tax += ((income - 372950) * 0.35);
                                }
                            } else {
                                tax += ((income - 208850) * 0.33);
                            }
                        } else {
                            tax += ((income - 137050) * 0.28);
                        }
                    } else {
                        tax += ((income - 67900) * 0.25);
                    }
                } else {
                    tax += ((income - 16700) * 0.15);
                }
            } else {
                tax += income * 0.10;
            }
            System.out.println("Your tax is: " + tax);
        }

        if (filingStatus == 2) {
            if (income > 8350) {
                tax += 835;
                if (income > 33950) {
                    tax += 3840;
                    if (income > 68525) {
                        tax += 8643.5;
                        if (income > 104425) {
                            tax += 10052;
                            if (income > 186475) {
                                tax += 54153;
                                if (income > 186476) {
                                    tax += ((income - 186475) * 0.35);
                                } else {
                                    tax += ((income - 186475) * 0.35);
                                }
                            } else {
                                tax += ((income - 104425) * 0.33);
                            }
                        } else {
                            tax += ((income - 68525) * 0.28);
                        }
                    } else {
                        tax += ((income - 33950) * 0.25);
                    }
                } else {
                    tax += ((income - 8350) * 0.15);
                }
            } else {
                tax += income * 0.10;
            }
            System.out.println("Your tax is: " + tax);
        }

        if (filingStatus == 3) {
            if (income > 11950) {
                tax += 1195;
                if (income > 45500) {
                    tax += 5032.5;
                    if (income > 117450) {
                        tax += 17987.5;
                        if (income > 190200) {
                            tax += 20370;
                            if (income > 372950) {
                                tax += 60307.5;
                                if (income > 372951) {
                                    tax += ((income - 372950) * 0.35);
                                } else {
                                    tax += ((income - 372950) * 0.35);
                                }
                            } else {
                                tax += ((income - 190200) * 0.33);
                            }
                        } else {
                            tax += ((income - 117450) * 0.28);
                        }
                    } else {
                        tax += ((income - 45500) * 0.25);
                    }
                } else {
                    tax += ((income - 11950) * 0.15);
                }
            } else {
                tax += income * 0.10;
            }
            System.out.println("Your tax is: " + tax);
        } else {

        }

    }
}
