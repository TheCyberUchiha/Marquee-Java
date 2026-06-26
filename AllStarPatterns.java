import java.util.Scanner;

public class AllStarPatterns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=======================================================");
            System.out.println("                 ✨ STAR PATTERN SELECTOR ✨             ");
            System.out.println("=======================================================");
            
            System.out.println("\n--- Triangle Patterns ---");
            System.out.println(" 1. Right Triangle (*)");
            System.out.println(" 2. Right Triangle with Spaces (* )");
            System.out.println(" 3. Inverted Right Triangle (* )");
            System.out.println(" 4. Right-aligned Triangle (Spaces then *)");

            System.out.println("\n--- Number & Character Patterns ---");
            System.out.println(" 5. Number Triangle (1, 12, 123)");
            System.out.println(" 6. Inverted Number Triangle (123, 12)");
            System.out.println(" 7. Inverted Same-Number Triangle (333, 22)");
            System.out.println(" 8. Alternating 1s and 0s Triangle");
            System.out.println(" 9. Inverted Character Triangle (A B C)");

            System.out.println("\n--- Pyramid & Diamond Patterns ---");
            System.out.println("10. Pyramid Pattern");
            System.out.println("11. Diamond Pattern");
            System.out.println("12. Left-aligned Half Diamond");
            System.out.println("13. Custom Diamond-like Shape (Fixed Size)");

            System.out.println("\n--- Square Patterns ---");
            System.out.println("14. Solid Square Pattern (* * * *)");
            System.out.println("15. Hollow Square");
            
            System.out.println("\n-------------------------------------------------------");
            System.out.println(" 0. Exit Program");
            System.out.println("-------------------------------------------------------");
            
            System.out.print("👉 Enter your choice (0-15): ");
            
            if (!sc.hasNextInt()) {
                System.out.println("\n❌ Invalid input. Please enter a valid number.");
                sc.next(); // consume the invalid input
                pause(sc);
                continue;
            }
            
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("\n👋 Exiting... Have a great day!");
                break;
            }

            if (choice < 0 || choice > 15) {
                System.out.println("\n❌ Invalid choice. Please select a number between 0 and 15.");
                pause(sc);
                continue;
            }

            int n = 0;
            // Pattern 13 is hardcoded to size 5 in the original logic, no need to ask for size
            if (choice != 13) {
                System.out.print("📏 Enter the size of the pattern (e.g. 5): ");
                if (!sc.hasNextInt()) {
                    System.out.println("\n❌ Invalid input for size. Please enter a number.");
                    sc.next();
                    pause(sc);
                    continue;
                }
                n = sc.nextInt();
                if(n <= 0) {
                    System.out.println("\n❌ Size must be greater than 0.");
                    pause(sc);
                    continue;
                }
            }

            System.out.println("\n================ RESULT ================\n");

            switch (choice) {
                case 1: rightTriangle(n); break;
                case 2: rightTriangleSpaces(n); break;
                case 3: invertedRightTriangle(n); break;
                case 4: rightAlignedTriangle(n); break;
                case 5: numberTriangle(n); break;
                case 6: invertedNumberTriangle(n); break;
                case 7: invertedSameNumberTriangle(n); break;
                case 8: alternating1s0s(n); break;
                case 9: invertedCharacterTriangle(n); break;
                case 10: pyramidPattern(n); break;
                case 11: diamondPattern(n); break;
                case 12: leftHalfDiamond(n); break;
                case 13: customDiamondShape(); break;
                case 14: solidSquare(n); break;
                case 15: hollowSquare(n); break;
            }
            
            System.out.println("\n========================================");
            pause(sc);
        }
        sc.close();
    }

    // A helper method to pause until the user is ready to continue
    private static void pause(Scanner sc) {
        System.out.print("\nPress Enter to continue...");
        // Consume any leftover newline
        sc.nextLine(); 
        sc.nextLine();
    }

    // ==========================================
    //            TRIANGLE PATTERNS
    // ==========================================
    
    public static void rightTriangle(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }

    public static void rightTriangleSpaces(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedRightTriangle(int a) {
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightAlignedTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ==========================================
    //      NUMBER & CHARACTER PATTERNS
    // ==========================================

    public static void numberTriangle(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void invertedNumberTriangle(int a) {
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void invertedSameNumberTriangle(int a) {
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void alternating1s0s(int a) {
        for (int i = 1; i <= a; i++) {
            int v = (i % 2 == 0) ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(v + " ");
                v = 1 - v;
            }
            System.out.println();
        }
    }

    public static void invertedCharacterTriangle(int a) {
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                char ch = (char) (j + 'A' - 1);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    // ==========================================
    //        PYRAMID & DIAMOND PATTERNS
    // ==========================================

    public static void pyramidPattern(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamondPattern(int a) {
        for (int i = 1; i <= a / 2 + 1; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = a / 2; i >= 1; i--) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void leftHalfDiamond(int a) {
        for (int i = 1; i <= a / 2 + 1; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = a / 2; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void customDiamondShape() {
        int n = 5;
        int star = 0;
        int space = 3;
        for (int i = 1; i <= n; i++) {
            if (i <= 3) {
                star++;
                space--;
            } else {
                star--;
                space++;
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }

            if (i == 2 || i == 4 || i == 3) {
                for (int j = 1; j <= 3; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    // ==========================================
    //             SQUARE PATTERNS
    // ==========================================

    public static void solidSquare(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowSquare(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (j == 1 || j == a || i == 1 || i == a) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // double space to match "* " width
                }
            }
            System.out.println();
        }
    }
}
