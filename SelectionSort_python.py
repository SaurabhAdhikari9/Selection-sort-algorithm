# a sort function that takes values and sorting order (ascending or descending) as an parameter
def sort(nums, order):

    # for goes upto the length of the nums
    for i in range(len(nums)):

        # min_index is the variable that holds the minimum index number according to 
        # the sorting order
        min_Index = i

        for j in range( i+1,len(nums)):
            
            # if the order is equals to the zero than sort the data in ascending order
            if (order == 0):

                if(nums[min_Index] > nums[j]):
                    min_Index = j
            # if the order is equals to the one than sort the data in descending order 
            elif (order == 1 ):

                if(nums[min_Index] < nums[j]):
                    min_Index = j
        #  swapping the values
        #  nums[i] assign with nums[min_index]
        # nums[min_index] assign with nums[i]  // it does not temporary variable like other language
        nums[i], nums[min_Index] = nums[min_Index], nums[i]

    


def main():
    # creating list of values
    numbers = [5,3,7,4,1,2,6]
    characters = ['c','a','e','b','d']

    # calling sorting functions
    sort(numbers,0)
    sort(characters,0)

    # pritning sorted values
    print(numbers)
    print(characters)
main()