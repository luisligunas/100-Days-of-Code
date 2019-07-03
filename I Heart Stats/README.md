## Day 9
*29 June 2019*

Knowing that I was going to be out the whole day, I thought of a way to still continue doing 100 Days of Code without actually having to code anything. I remembered going to a data science talk and I asked the speaker what MOOCs would be nice entries into data science. He mentioned the course I Heart Stats. I looked it up and found out that its full name was [I "Heart" Stats: Learning to Love Statistics](https://www.edx.org/course/i-heart-stats-learning-to-love-statistics) and that it was offered by the University of Notre Dame.

There were some videos at the start of the course that covered some math basics, but I watched them just in case there were concepts that I didn't know. All the topics turned out to be concepts that I already knew. There was also a video that talked about variables (independent, dependent).

The first pieces of information that were actually new to me were the levels of information: nominal, ordinal, interval, and ratio. It was interesting to learn that there are some techniques that are exclusive to the higher levels of information. Also, techniques applicable to lower levels of information are applicable to the higher levels, but some information will be lost in doing so.

---
## Day 10
*1 July 2019*

I finished up the first module on variables and I wound up looking through some of the questions in the discussion forum. One question intrigued me and I'm still debating in my head what the answer is. The question went something like, "Are temperatures in Kelvin considered as measurements on the ratio level?" Temperatures in Celsius and Fahrenheit are obviously on the interval level as their "zeros" don't refer to actual "zeros". Although, I am not sure if an increase of one degree of Kelvin has the same increase energy-wise all throughout.

I was also able to complete the second module, which was about the measures of central tendency and dispersion. The measures of central tendency, namely the mean, median, and mode, were not unfamiliar to me. What was unfamiliar to me, however, was that they worked on different levels of measurement. **The mean, median, and mode work on the interval, ordinal, and nominal levels, respectively.** *Note that these levels are the lowest levels that they can work on and that they may be applied to levels of measurement higher than those stated.* I was also reminded that the symbol, ![equation](https://latex.codecogs.com/svg.latex?\overline{X}), pronounced as x-bar, refers to the mean.

The concept of dispersion refers to how spread out the data is. **The lower the measurements of dispersion is, the more accurate the measurements of central tendency are.** Also, the methods used to measure dispersion relies on the level of measurement of the data.

Measurements of Dispersion
- Range
	- Not that informative because it only signifies the two most extreme values
	- Usually refers to the difference between the largest and smallest values, implying that it can only work on the **interval level or higher**
	- It can also be used, however, on the **ordinal level** by indicating the smallest and largest values instead of the difference between them
- Variation Ratio (VR)
	- ![equation](https://latex.codecogs.com/svg.latex?VR%20%3D%201%20-%20%5Cfrac%7B%5Ctext%7B%5C%23%20of%20entries%20of%20mode%7D%7D%7B%5Ctext%7Btotal%20%5C%23%20of%20entries%7D%7D%20%3D%20%5Cfrac%7BN_m%7D%7BN%7D)
	- Works on the **nominal level or higher**
	- Simply the percentage of entries that are not in the mode group
- Mean Deviation (MD)
	- ![equation](https://latex.codecogs.com/svg.latex?MD%20%3D%20%5Cfrac%7B%5Csum%20%7C%20x_i%20-%20%5Coverline%7BX%7D%20%7C%7D%7BN%7D)
	- Works on the **interval level or higher**
- Standard Deviation (s)
	- ![equation](https://latex.codecogs.com/svg.latex?s%20%3D%20%5Csqrt%7B%5Cfrac%7B%28%5Csum%20%28x_i%20-%20%5Coverline%7BX%7D%29%5E2%7D%7BN%7D%7D)
	- Like the MD, the standard deviation works on the **interval level or higher**.
	- Also like the MD, the SD describes how close all the values are to the mean.

Looking back at the different measurements of dispersion, I found that the MD and the SD were very similar. I scanned the forums for the second module and I found that some people had the same question. I ended up finding two reasons why the SD is preferred over the MD. The first can be found in this [link](https://www.mathsisfun.com/data/standard-deviation.html) in the footnotes entitled *Why square the differences?* It gives two examples that produced the same MD (but different SD) despite one of them having values which were obviously more spread out than the other. The second reason is a clarification made by Sarah, one of the lecturers in the course. It is as follows.
> [...] I would add that the standard deviation isn't necessarily more accurate than the mean deviation, but gives a result that is "standardized" which means that it can be compared to the standard deviations of other datasets, regardless of their size or scale. For instance, the mean deviation of a question that has a range from 20,000 to 80,000 will be different than the mean deviation for a question that has a range from 0 to 10, making it difficult to compare those mean deviations. You'll learn a bit more about the wider implications of the characteristics of the standard deviation in Module 3 when we get into the concept of the normal distribution.

That's all for now. On to moduele 3!
