package by.itstep.javatraining.revision.task;

/*	Task 04. Ordering Numbers [упорядочивание чисел]
 *
 *	Даны три числа. Упорядочите их в порядке неубывания.
 *
 *	Формат входных данных [input]
 *	На вход даётся три числа в диапазоне целочисленного типа int.
 *
 *	Формат выходных данных
 *	Возвратите в виде строки три числа, которые упорядочены в порядке неубывания.
 *	Числа в строке должны быть разделены друг от друга одним пробелом
 *
 *	[ input 1]: 7 6 1
 *	[output 1]: 1 6 7
 *
 *	[ input 2]: 6 7 2
 *	[output 2]: 2 6 7
 *
 *	[ input 3]: 7 4 7
 *	[output 3]: 4 7 7
 */

public class Task04 {
    public static String task04(int a, int b, int c) {
        StringBuilder stringBuilder = new StringBuilder();
        if(b < c && b < a){
            stringBuilder.append(b).append(" ").append(c > a ? a : c).append(" " + (c > a ? c : a));
        } else if (c < a) {
            stringBuilder.append(c).append(" ").append(b > a ? a : b).append(" " + (b > a ? b : a));
        }else{
            stringBuilder.append(a).append(" ").append(b > c ? c : b).append(" " + (c > b ? c : b));
        }
        return stringBuilder.toString();
    }
}
