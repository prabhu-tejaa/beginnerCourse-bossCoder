package notes.sorting;

public class sortingNotes {

    /*
    sorting = means arranging data in a meaningful order

    we have two types of sorting algorithms
    1. compression based
    2. non compression based

    1. comparison based -> means comparing sort
    a. bubble sort
    b. selection sort
    c. insertion sort
    d. heap sort
    e. merge sort
    f. quick sort

    2. non compression based -> we don't compare here yet we can sort it
    a. radix sort
    b. bucket sort
    c. count sort

    most of the time we use merge and quick, which has a time complexity of O(N log N)

    now we'll be learning in beginner course, only

    a. bubble sort
    b. selection sort
    c. insertion sort
    c. count sort

    Bubble sort:

    - in each iteration, the algorithm processes from index 0 to the next unsorted index, gradually pushing the largest
      unsorted element to its correct position at the end of the array

      Example Walkthrough
        Let’s take an example with the array {5, 3, 8, 4, 2}:

        First Pass (i = 0):

        Compare 5 and 3, swap → {3, 5, 8, 4, 2}
        Compare 5 and 8, no swap → {3, 5, 8, 4, 2}
        Compare 8 and 4, swap → {3, 5, 4, 8, 2}
        Compare 8 and 2, swap → {3, 5, 4, 2, 8}
        At the end of the first pass, 8 is in its correct position.

        Second Pass (i = 1):

        Compare 3 and 5, no swap → {3, 5, 4, 2, 8}
        Compare 5 and 4, swap → {3, 4, 5, 2, 8}
        Compare 5 and 2, swap → {3, 4, 2, 5, 8}
        At the end of the second pass, 5 is in its correct position.

        Third Pass (i = 2):

        Compare 3 and 4, no swap → {3, 4, 2, 5, 8}
        Compare 4 and 2, swap → {3, 2, 4, 5, 8}
        Continue this process until all elements are sorted.


    Selections sot:
    By continuously selecting the smallest element from the unsorted segment and placing it at the end of the sorted
    segment, Selection Sort gradually builds up the sorted portion of the array, leading to a fully sorted array at the
    end of the algorithm. This method is straightforward but not the most efficient for larger datasets due to its O(n²)
    time complexity.

    Example Walkthrough
    Let’s take an example with the array {64, 25, 12, 22, 11}:

    First Pass (i = 0):

    The current segment is {64, 25, 12, 22, 11}.
    Find the minimum:
    Compare 64 with 25, update minIndex to 1 (25 is smaller).
    Compare 25 with 12, update minIndex to 2 (12 is smaller).
    Compare 12 with 22, no update.
    Compare 12 with 11, update minIndex to 4 (11 is smaller).
    Swap 64 and 11: {11, 25, 12, 22, 64}.

    Second Pass (i = 1):

    The current segment is {25, 12, 22, 64}.
    Find the minimum:
    Compare 25 with 12, update minIndex to 2.
    Compare 12 with 22, no update.
    Compare 12 with 64, no update.
    Swap 25 and 12: {11, 12, 25, 22, 64}.

    Third Pass (i = 2):

    The current segment is {25, 22, 64}.
    Find the minimum:
    Compare 25 with 22, update minIndex to 3.
    Compare 22 with 64, no update.
        Swap 25 and 22: {11, 12, 22, 25, 64}.
    Fourth Pass (i = 3):

    The current segment is {25, 64}.
    Find the minimum (no swap needed as 25 is smaller than 64).


    Insertion sort:
    Insertion Sort in Simple Terms
    Start with a List: You have a list of numbers that are mixed up, like this: [5, 2, 9, 1, 5, 6].

    Take One Number: Look at the second number (2) and compare it to the first number (5).

    Insert in Order:

    If 2 is smaller than 5, move 5 to the right and put 2 in the first position.
    Your list now looks like: [2, 5, 9, 1, 5, 6].
    Repeat:

    Next, take the third number (9). It’s already in the right place, so nothing changes: [2, 5, 9, 1, 5, 6].
    Then take 1. Move 2, 5, and 9 to the right to insert 1: [1, 2, 5, 9, 5, 6].
    Next is 5. Move 9 to the right and place 5: [1, 2, 5, 5, 9, 6].
    Finally, take 6. Move 9 to the right and place 6: [1, 2, 5, 5, 6, 9].
    Final Result: The list is now sorted: [1, 2, 5, 5, 6, 9].

    Count sort:

    Counting Sort is a non-comparison sorting algorithm which counts how many times each number appears and then uses that count to put the numbers in order.
    It’s really fast when the range of numbers is small compared to how many numbers you have.

     */
}
