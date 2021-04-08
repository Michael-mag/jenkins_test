import unittest
from two_sum import Solution
class check_two_sum(unittest.TestCase):
    """
    will test the results
    """
    def test_2_sum(self):
        ts = Solution()

        a1,a2,a3 = [2,7,11,15],[3,2,4],[3,3]
        t1,t2,t3 = 9,6,6
        r1,r2,r3 = [0,1],[1,2],[0,1]

        self.assertEqual(ts.twoSum(a1,t1),r1)
        self.assertEqual(ts.twoSum(a2,t2),r2)
        self.assertEqual(ts.twoSum(a3,t3),r3)

    def test_fails(self):
        """
            This test is supposed to fail
        """
        ts = Solution()

        a1,a2,a3 = [2,7,11,15],[3,2,4],[3,3]
        t1,t2,t3 = 9,6,6
        r1,r2,r3 = [0,1],[0,2],[0,1]

        self.assertEqual(ts.twoSum(a1,t1),r1)
        self.assertEqual(ts.twoSum(a2,t2),r2)
        self.assertEqual(ts.twoSum(a3,t3),r3)

if __name__ == "__main__":
    unittest.main()