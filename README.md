# Readable Format integer long value
This project is created to read better big digit numbers.
Let's give a short example.


### For integer
```
int num=1234;
String text=ReadableFormat.getStringValue(num);
System.out.println(text);
```
And the result will be 

```
1_234
```

### For long
Another example of long variable : 
```
long num2=123456789123L;
String text2=ReadableFormat.getStringValue(num2);
System.out.println(text2);
```
And the result will be
```
123_456_789_123
```
