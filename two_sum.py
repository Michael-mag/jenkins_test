"""
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
"""
class Solution(object):
     def twoSum(self, nums,target):
        hash_table = {}
        for index, element in enumerate(nums):
            diff = target - element
            if diff in hash_table:
                return [hash_table[diff],index]
            else:
                hash_table[element] = index
        