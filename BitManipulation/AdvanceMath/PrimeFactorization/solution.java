// import java.util.*;

// class Solution {
//     private static final int MAX_N = 100000;

//     /* To store the smallest prime factors for 
//     all number with all nodes initially 
//     having smallest prime factor as 1 */
//     private int[] SPF = new int[MAX_N + 1];

//     /* Constructor to initialize the smallest prime factor array */
//     public Solution() {
//         Arrays.fill(SPF, 1);
//     }

//     /* Function to precompute smallest prime 
//     factor using sieve of eratosthenes */
//     private void sieve() {
//         // Iterate on all the number
//         for (int i = 2; i <= MAX_N; i++) {
//             // If the number is a prime number 
//             if (SPF[i] == 1) {
//                 /* Mark all its multiples who have not 
//                 received their smallest prime factor yet*/
//                 for (int j = i; j <= MAX_N; j += i) {
//                     // If smallest prime factor not received yet
//                     if (SPF[j] == 1) {
//                         /* Store i as the smallest 
//                         prime factor for its multiple */
//                         SPF[j] = i;
//                     }
//                 }
//             }
//         }
//     }

//     /* Helper function to find the prime 
//     factorization of a number */
//     private List<Integer> primeFact(int n) {
//         // To store the result
//         List<Integer> ans = new ArrayList<>();

//         // Until the number is not reduced to 1
//         while (n != 1) {
//             // Add the smallest prime factor to the list
//             ans.add(SPF[n]);
//             // Update the number
//             n = n / SPF[n];
//         }

//         // Return the result
//         return ans;
//     }

//     /* Function to get the prime 
//     factorization of all the number */
//     public List<List<Integer>> primeFactors(int[] queries) {
//         /* Precompute the smallest 
//         possible factor for all numbers */
//         sieve();

//         // To store the answer
//         List<List<Integer>> ans = new ArrayList<>();

//         // Iterate on each number in query
//         for (int query : queries) {
//             /* Function call to get the prime 
//             factorization of current number */
//             ans.add(primeFact(query));
//         }

//         // Return the answer
//         return ans;
//     }

//     public static void main(String[] args) {
//         int[] queries = {2, 3, 4, 5, 6};

//         /* Creating an instance of 
//         Solution class */
//         Solution sol = new Solution();

//         // Function call to get all primes till N
//         List<List<Integer>> ans = sol.primeFactors(queries);

//         System.out.println("The prime factorization of all the numbers is: ");
//         for (int i = 0; i < ans.size(); i++) {
//             System.out.print("For " + queries[i] + ": ");
//             for (int factor : ans.get(i)) {
//                 System.out.print(factor + " ");
//             }
//             System.out.println();
//         }
//     }
// }