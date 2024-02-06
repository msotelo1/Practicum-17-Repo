# Instructions  

## Practicum 17 - More on Operator Precedence<br>

### BACKGROUND<br>
**Operators with Left-to-Right Precedence**
<br>
We have discussed the operator precedence table in Java that
indicates which operators are applied first in an expression, when parentheses are not used. For example, in the expression
<br><br>
`2 + 3 * 4`
<br><br>
the multiplication operator ,`*`, is applied first (to operands
3 and 4) yielding the value `12`, and thus the addition operator,
`+`, is applied to the operands `2` and `14`, yielding `16`. 
Thus, we say that mutiplication has *high precedence* than
addition in Java.
<br><br>
What happens when the operators in an expression have the
*same* level of precedence? Which one would be applied first?
For the operation of multiplication, is doesn't matter as
the same result is given,
<br><br>
`(2 * 10) * 4` --> `20 * 4` --> `80`
`2 * (10 * 4)` --> `2 * 40` --> `80`
<br><br>
This is not true for division, however,
<br><br>
`(20 / 10) / 2` --> `2 / 2` --> `1`<br>
`20 / (10 / 2)` --> `20 / 5` --> `4`
<br><br>
So, which of the above order of operations does Java perform when
parentheses are not used?
<br><br>
`20 / 10 / 2` --> ?
<br><br>
Turns out that this is also specified in the operator precedence
table. In the table, both `*` and `/` are listed as having 
*left-to-right associativity*. This means that when the order
that the operators `*` and `/` are to be applied is not specified
with parentheses, they are applied left-to-right. Thus, the
above expression would evaluate to `1`.

In Java's operator precedence table, `*` and `/` have the
same level of precedence (which is higher than the level of
precedence of the operators `+` and `-`). Thus,
the same left-to-right application of operators
would be used in expression with a mixture of
these two operators, e.g.,
<br><br>
`2 * 10 / 5 * 4` --> `16`.
<br><br>
**Operators With Right-to-Left Associativity**
<br>
Most operators have left-to-right associativity.
However, for some operators, right-to-left
associativity is used.
<br><br>
In Java, multiple varaibles are able to be assigned
in one statement,
<br><br>
`num1 = num2 = num3 = 0;`
<br><br>
If the leftmost assignment operator were applied
first, then `num2` would be assigned to `num1`
before any of the other assignment operators were 
applied. However, if these three variables are
currently unassigned, then assigning the value
in `num2` to variable `num1` makes no sense and
would cause an error. That makes more sense is
to apply the operators right-to-left. Thus, 
first `0` would be assigned to varaible `num3`.
Now that `num3` has a value, it would be assigned
to `num2`. Then with `num2` assigned, it's value
would be assigned to `num1`. The expression would
therefore execute as,
<br><br>
`(num1 = (num2 = (num3 = 0)));`
<br><br>
Note that in order for this to work, an assignment
statement must return a value. This is the case in
Java. The subexpression `(num3 = 0)` not only performs
the assignment, but also is an expression that
evaluates to `0` (the value being assigned). Not
all programming languages implement assigment to
evaluate as an expression like this.

### WHAT TO DO<br>
- `Update each of the four assignment statements`,
**only if needed**, so that the value displayed
matches the required value in each corresponding
comment statement.
- (There are no test runs for this practicum)
