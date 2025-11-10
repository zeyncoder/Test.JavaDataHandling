package level5.loginvalidation;

import java.util.Scanner;

public class LoginValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("new line");


        String userRegex = "^[A-Za-z0-9]+$";
        String passRegex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*]).{6,}$";
        String phoneRegex = "^\\+994\\d{9}$";

        System.out.print("İstifadəçi adı: ");
        System.out.println("(İstifadəçi adı yalnız hərf və rəqəmlərdən ibarət olmalıdır!)");
        String username = sc.nextLine();

        if (!username.matches(userRegex)) {
            System.out.println("İstifadəçi adı yalnız hərf və rəqəmlərdən ibarət olmalıdır!");
            sc.close();
            return;
        }


        int maxAttempts = 3;
        int attempts = 0;
        boolean loggedIn = false;

        while (attempts < maxAttempts) {
            System.out.print("Şifrə: ");
            System.out.println(" sifre ən az 1 böyük hərf, 1 rəqəm, 1 xüsusi simvol və 6+ simvoldan ibaret olmalidir");
            String password = sc.nextLine();

            if (password.matches(passRegex)) {
                System.out.println("Daxil oldun ✅");
                loggedIn = true;
                break;
            } else {
                attempts++;
                int remaining = maxAttempts - attempts;
                System.out.println("Şifrə qaydalara uyğun deyil ❌" +
                        (remaining > 0 ? " Yenidən cəhd et. Qalan cəhd: " + remaining : ""));
            }
        }


        if (!loggedIn) {
            System.out.println("\n3 dəfə şifrə səhv daxil edildi. Sisteme yeniden giris etmek ucun nomrenizi daxil edin");
            String phone;
            while (true) {
                System.out.print("Telefon nömrəni daxil et (məs: +994501234567): ");
                phone = sc.nextLine();

                if (phone.matches(phoneRegex)) {
                    System.out.println("Telefon nömrə təsdiqləndi ✓");
                    break;
                } else {
                    System.out.println("Yanlış format! Nömrə +994 ilə başlamalı və 9 rəqəmdən ibarət olmalıdır.");
                }
            }


            while (true) {
                System.out.print("Yeni şifrəni daxil et: ");
                String newPassword = sc.nextLine();

                if (newPassword.matches(passRegex)) {

                    System.out.println("Şifrə uğurla qeyde alindi ✅");
                    System.out.println("Yeni şifrə ilə daxil oldunuz.");
                    break;
                } else {
                    System.out.println("Yeni şifrə qaydalara uyğun deyil! (ən az 1 böyük hərf, 1 rəqəm, 1 xüsusi simvol və 6+ simvol)");
                }
            }
        }

        sc.close();
    }
}
