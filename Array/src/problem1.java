// Given an array  of marks of students, if the marks of student is less then 35 then print it's roll no.
// roll no. = index of an array
public class problem1 {
    public static void main(String[] args) {
        int[] arr = {36,78,90,12,56,45,76,87,28,97};

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]<35) System.out.println("Student roll number is:"+i);
        }
    }
}
