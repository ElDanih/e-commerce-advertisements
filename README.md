
# Problem

An e-commerce site has a series of advertisements to display. Links to the ads are stored in a datastructure and they are displayed or not based on the value at a bit position in a number. The sequence ofads being displayed at this time can be represented as a binary value, where 1 means the ad is displayed and 0 means it is hidden. The ads should rotate, so on the next page load, ads that are displayed now arehidden and vice versa.

Given a base 10 integer representing the current display state of all ads, determine its binaryrepresentation. Starting from the position of its highest order 1 bit, negate that bit and all lower order bitsfrom 0 to 1 or from 1 to 0. Return the base 10 representation of the result.

#### Example:
base10 = 30

30(10) = 00011110(2)

Strip the insignificant zeros then flip all of the bits in 11110(2) to get 00001(2) = 1(10) .The example shows thevalue as an 8-bit binary to demonstrate that preceding zeros are discarded.

### Function Description
Complete the function changeAds in the editor below


changeAds has the following parameter:

int base10: an integer in base 10


### Return:

int: the base 10 value of the resulting binary


### Constraints
 0 <= base10 <= 10^5
