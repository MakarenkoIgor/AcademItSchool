import ru.academits.makarenko.range.Range;

/**
 * Created by 1 on 04.02.2017.
 */
public class Test {
    public static void main(String[] args) {
        Range range = new Range(1.2, 3.7);
        range.print();
        double x = 1.5;
        boolean z = range.isInside(x, 1.2, 3.7);
        System.out.println(z);

    }

}
