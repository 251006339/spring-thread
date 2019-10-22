package com.thread.springthread.demo.demo2;

/**
 * @author XAIOHU
 * @date 2019/10/11 --12:04
 **/
public class Test111 {
    public static void main(String[] args) {

        int[] nums1 = {1, 3, 5, 7, 9};
        int m = 12;
        int n = 14;
        int[] nums2 = {2, 4, 6, 8, 10};
        Test111 test111 = new Test111();

        int[] merge = test111.merge(nums1, m, nums2, n);
        for (int i = 0; i < merge.length; i++) {
            System.out.println(merge[i]);
        }

    }

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] t = new int[nums1.length + nums2.length + 2];
        System.arraycopy(nums1, 0, t, 0, nums1.length);
        System.arraycopy(nums2, 0, t, nums1.length, nums2.length);
        t[t.length - 1] = n;
        t[t.length - 2] = m;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length - i - 1; j++) {
                if (t[i] > t[i + 1]) {
                    int temp = t[i];
                    t[i] = t[i + 1];
                    t[i + 1] = temp;
                }
            }
           }
          return t;
    }
}
