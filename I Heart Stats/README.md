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

---
## Day 11
*3 July 2019*

Module 3 tackles the topic of **inferential statistics**. I don't fully understand what the term itself means, but doing a quick search, I figured out why I wasn't able to pick up the definition of inferential statistics while watching the videos. Apparently, inferential statistics is actually what I perceived the entirety of statistics to be. It's simply one of the two main branches of statistics that uses **random samples to represent a population**. Of course, it is possible that a sample does not reflect the characteristics of the entire population. Thus, inferential statistics also concerns itself with finding out what the chances are that an inference is correct or not. To simplify the analysis of data, there are some assumptions that must be made so that statistical tests can be used. One of these assumptions is how a variable is distributed in a population.

A popular type of distribution is the normal distribution. Some of its properties are listed below.
- The farther you get from the mean, the fewer the cases are.
- The mean, median, and mode are all the same.
- **One unit of SD** away from the mean covers **68%** of the population.
- **Two units of SD** away from the mean covers **95%** of the population.
- **Three units of SD** away from the mean covers **~99.7%** of the population.

As mentioned previously, inferential statistics concerns itself with the probability of an inference being correct or incorrect. Thus, there is a **confidence level** used in inferential statistics, which indicates how tolerant we can be to error. Although it can be any confidence level, the value usually used is 0.05, indicating that it is alright to be incorrect 5% of the time.

A **null hypothesis** is a claim that there is no relationship between two variables, rooting from the lack of a significant difference among different populations. Any observed difference is caused by sampling or experimental error. One consideration when doing analysis involving the null hypothesis is that the **standard deviation is needed**. Despite not being able to get the actual SD of the population, it can be estimated by getting the SD of the sample. Another consideration is that different relationships follow different types of distributions.

Note: It is unnecessary to get the actual values of the entire population. Getting the values for a random sample is enough. The requirement to be able to get valid conclusions from the sample, however, is to show, with a certain level of certainty, that a relationship exists.

#### Types of Error
- Type 1 (False Positive)
	- Claiming that a relationship exists when it actually does not
- Type 2 (False Negative)
	- Claiming that a relationship does not exist when it actually does
- It is much riskier to make the type 1 error compared to the type 2 error.
- The attempt to minimize either of these errors would likely result in an increase in the chances of making the other error type.

Hypothesis testing is simply the use of statistics to determine the probability that a given hypothesis is true. The seven steps for hypothesis testing are listed below.

#### Steps in Hypothesis Testing
1. Make assumptions.
	- The sample is representative of the population.
		- The sample should have been randomly selected.
	- The data collection method must be valid.
		- The data that is obtained must be a valid measure of the variable used in the experiment.
	- The statistical test used must be appropriate to the levels of measurement of the data.
		- In fact, the levels of measurement of the data dictates the type of statistical test that must be used.
2. State your hypothesis.
	- The research hypothesis, as opposed to the null hypothesis, states that differences among groups is statistically significant, implying a relationship between variables.
	- A one-tail test, as opposed to a two-tail test, can be used when there is a direction to the relationship being tested.
		- One-tail: "The higher someone's educational attainment is, the more money they make on a monthly basis."
		- Two-tail: "Educational attainment affects how much a person makes on a monthly basis."
3. Choose the appropriate statistical test and significance level.
	- As stated previously, the levels of measurement of the data dictates the type of statistical test that must be used.
4. Calculate the test statistic.
5. Compare the computed value to the critical value.
	- Critical value: the threshold of statistical significance
	- The critical values can be obtained from existing tables for different types of formulas and different levels of significance.
6. Make a decision about the hypothesis.
	- If the computed value is higher than the critical value, then the relationship of the variables is considered to be significant. Thus, we "fail to reject" the null hypothesis.
	- In the case where the computed value is less than the critical value, then the null hypothesis must be rejected.
7. Make substantive sense of the decision.
	- The goal of this step is to move past the numbers and to be able to draw a conclusion that actually makes use of the results of the experiment.
	- A lot of relationships can be statistically significant, but some discoveries may not be useful or have very minimal impact.

The three main formulas used when testing significance are the Chi-square, T, and F (ANOVA) formulas. They were briefly discussed, but I will be talking more about them in the entries for the future modules.
