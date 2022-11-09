package com.Java;

class Abc {
    public int add(int... n)
    {
        int sum=0;
        for(int i : n) {
            sum = sum + i;
        }
                return sum;
            }
        }

        public class K_Varargs
        {
            public static void main(String[] args)
            {
                Abc obj = new Abc();
                System.out.println(obj.add(4, 5, 5, 4, 6, 7, 8, 9, 7, 5, 4, 3 ));
            }
        }



