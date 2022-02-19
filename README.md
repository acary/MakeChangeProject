#### Make Change project

### Description

This program calculates change for a purchase.

- Static variables keep track of item price, amount tendered, and remaining change.
- Methods help isolate functional components.

### Lessons Learned

- Double types defaulted to many decimal places when performing operations, which provided too fine of a precision in regards to currency with two decimal places.
- The `DecimalFormat` object provided a way to define the decimal places required: `DecimalFormat df = new DecimalFormat("#.00")`
- Converting the DecimalFormat back to Double helped continue with the calculation: `remaining = Double.valueOf(df.format(remaining))`

### Technologies Used

- JavaSE-1.8
- Eclipse IDE

### Author

- Andy Cary (@acary)
