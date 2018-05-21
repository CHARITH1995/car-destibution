import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
static int carDistribution(int n, int[] arr) {
int max_count = 1 ;
int res = arr[0];
int curr_count = 1 ;
for (int i = 1 ; i < n; i++)
{
if (arr[i] == arr[i - 1 ])
curr_count++;
else
{
if (curr_count > max_count)
{
max_count = curr_count;
res = arr[i - 1 ];
}c
urr_count = 1 ;
}
}if
(max_count > arr[n-1 ])
{
max_count = curr_count;
res = arr[n - 1 ];
}r
eturn res;
}p
ublic static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int[] ar = new int[n];
for(int ar_i = 0; ar_i < n; ar_i++){
ar[ar_i] = in.nextInt();
}in
t result = carDistribution(n, ar);
System.out.println(result);
}}