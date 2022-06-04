class Solution:
    def canPartition(self, nums: List[int]) -> bool:
        if sum(nums)%2!=0:
            return False
        target=sum(nums)//2
        sums=set()
        sums.add(0)
        for num in nums:
            sumsCopy=set()
            for s in sums:
                if s+num==target:
                    return True
                sumsCopy.add(s)
                sumsCopy.add(s+num)
            sums=sumsCopy
        return False
        