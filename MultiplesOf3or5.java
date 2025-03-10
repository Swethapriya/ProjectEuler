// If we list all the natural numbers below  10
//  that are multiples of 3 
//  or 5
// , we get 3,5,6,9
//  and 
// . The sum of these multiples is 23
// .

// Find the sum of all the multiples of 3
//  or 5
//  below 1000
// .

public class MultiplesOf3or5(int max) {
  int sum = 0;
  for (int i =1; i < max; i++) {
    if (max % 3 == 0 || max % 5 == 0) {
      sum += i;
    }
  }
  return sum;
}

public static void main(String[] args) {
  System.out.println(MultiplesOf3or5(1000));
}
