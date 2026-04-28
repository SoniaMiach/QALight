package java_hm_3;

import java.util.Scanner;

public class DownloadLinkGenerator {
    //Methods. Task 3
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the program (IntelliJ, Git, Java):");
        String program = scanner.nextLine();
        System.out.println("Enter OS (Windows, MacOS, Linux):");
        String os = scanner.nextLine();
        System.out.println(getLink(program, os));
        scanner.close();
    }
    public static String getLink(String program, String os) {
        switch (program.toLowerCase()) {
            case "intellij":
                switch (os.toLowerCase()) {
                    case "windows":
                        return "https://www.jetbrains.com/idea/download/#section=windows";
                    case "macos":
                        return "https://www.jetbrains.com/idea/download/#section=mac";
                    case "linux":
                        return "https://www.jetbrains.com/idea/download/#section=linux";
                    default:
                        return "There is no such OS";
                }
            case "git":
                switch (os.toLowerCase()) {
                    case "windows":
                        return "https://git-scm.com/download/win";
                    case "macos":
                        return "https://git-scm.com/download/mac";
                    case "linux":
                        return "https://git-scm.com/download/linux";
                    default:
                        return "There is no such OS";
                }
            case "java":
                switch (os.toLowerCase()) {
                    case "windows":
                    case "macos":
                    case "linux":
                        return "https://www.oracle.com/java/technologies/downloads/";
                    default:
                        return "There is no such OS";
                }
            default:
                return "That operating system doesn't exist";
        }

    }
}
