
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] c = new int[nums1.length + nums2.length];

        int k = 0;
        int j = 0;
        int i = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                c[k] = nums1[i];
                i++;
            } else {
                c[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < nums1.length) {
            c[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            c[k] = nums2[j];
            j++;
            k++;
        }
        int n = c.length;

        if (n % 2 == 1) {
            return c[n / 2];
        } else {
            return (c[n / 2 - 1] + c[n / 2]) / 2.0;
        }
    }
}