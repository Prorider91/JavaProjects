//Пиленков Александр Андреевич prorider91@gmail.com
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

class Ex01 {
    public static void main(String[] args) {
        BiPredicate<Set<Character>, String> isIllegalString = (cset, str) -> {

            for (int i = 0; i < str.length(); i++) {
                if (!cset.contains(str.charAt(i))) {
                    return true;
                }
            }
            return false;
        };
        System.out.println(isIllegalString.test(Set.of('a', 'b'), "abc"));
        System.out.println(isIllegalString.test(Set.of('a', 'b'), "ab"));
    }
}

class Ex02 {

    static void printHello(String str) {
        System.out.println("Hello " + str);
    }

    public static void main(String[] args) {

        Consumer<String> s = Ex02::printHello;
        s.accept("Alex");
    }
}

class Ex03 {

    public static void main(String[] args) {

        Consumer<String> printCode = (str) -> {
            for (char c : str.toCharArray()) {
                System.out.print((int)c + " ");
            }
        };
        printCode.accept("abc");
    }
}

public class Module_1 {}
