# Goal

Develop a graphical simple graphical calulator with proper error handing

## Technical Requirements:

 - Written Java 23 se
 - Readable error handling for end user
 - Needs a GUI
 - Dependency manager
 - Support the following functions:
   - addition
   - subtraction
   - multiplication
   - division
   - exponent power of 2 and 3
     - Possible enhancement is to add other powers
   - log base 10
     - Possible enhancement is to add other base support
- Support for iconography
- Intuitive input
- Key mapping (P4)

## Implementation Details

 - Use Java AWT library for GUI operations
 - Extends the base java.lang.Exception class to produce custom error handling
 - exp4j for Math library
 - To support intuitive input we will
   - power/log functions will resolve itself once the next operator is selected
 - use Gradle for deps management