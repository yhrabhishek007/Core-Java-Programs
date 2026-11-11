package com.collection.comparable;

public class ComparableVsComparator {

	public static void main(String[] args) {

//		## Comparable vs Comparator — Interview POV
//
//		 This is a **very common Java interview question**. The easiest way to remember it is:
//
//		 > **Comparable = default/natural sorting**\
//		>  **Comparator = custom/multiple sorting**
//
//		 | Point           | Comparable | Comparator |
//	     | ---             | ---        | ---        |
//		| Package          | `java.lang` | `java.util` |
//		| Main method      | `compareTo()` | `compare()` |
//		| Abstract methods | 1          | 1             |
//		| Functional interface? | Yes    | Yes           |
//		| Sorting logic     | Inside the class | Outside the class |
//		| Purpose            | Natural/default ordering | Custom ordering |
//		| Number of sorting strategies | Generally one natural order | Multiple possible orders |
//		| Class modification   | Class must implement it | Class doesn't need modification |
//		| Common usage | `Collections.sort(list)` | `Collections.sort(list, comparator)` |
//		| Lambda | Possible | Very commonly used |
//
//		### 1\. Comparable — Natural Ordering
//
//		 Suppose `Mobile` should **naturally be sorted by price**.
//
//		```
//		public class Mobile implements Comparable<Mobile> {
//
//		    double price;
//
//		    @Override
//		    public int compareTo(Mobile m) {
//		        return Double.compare(this.price, m.price);
//		    }
//		}
//		```
//
//		 Now:
//
//		```
//		Collections.sort(mobileList);
//		```
//
//		 Java uses:
//
//		```
//		compareTo()
//		```
//
//		 **Interview statement:**
//
//		 > Comparable is used when a class wants to define its own natural/default ordering.
//
//		---
//
//		 ### 2\. Comparator — Custom Ordering
//
//		 Suppose you don't want `Mobile` to have a fixed natural order.
//
//		 You might want:
//
//		```
//		Sort by price
//		Sort by brand
//		Sort by model
//		```
//
//		 You can create different comparators:
//
//		```
//		Comparator<Mobile> byPrice =
//		    (m1, m2) -> Double.compare(m1.price, m2.price);
//
//		Comparator<Mobile> byBrand =
//		    (m1, m2) -> m1.brand.compareTo(m2.brand);
//		```
//
//		 Then:
//
//		```
//		mobileList.sort(byPrice);
//		```
//
//		 or:
//
//		```
//		mobileList.sort(byBrand);
//		```
//
//		 **Interview statement:**
//
//		 > Comparator is used when we need custom or multiple sorting strategies without changing the original class.
//
//		---
//
//		 ## The most important difference
//
//		 Imagine your `Mobile` class:
//
//		```
//		Mobile
//		 ├── brand
//		 ├── model
//		 └── price
//		```
//
//		 With **Comparable**:
//
//		```
//		Mobile
//		   ↓
//		implements Comparable
//		   ↓
//		compareTo()
//		   ↓
//		ONE natural sorting rule
//		```
//
//		 With **Comparator**:
//
//		```
//		Mobile
//		   ↓
//		No sorting logic required
//
//		Comparator 1 → by price
//		Comparator 2 → by brand
//		Comparator 3 → by model
//		```
//
//		 That's why **Comparator is more flexible when you need multiple sorting criteria**.
//
//		---
//
//		 ## Anonymous Class vs Lambda
//
//		 Your example uses an **anonymous inner class**:
//
//		```
//		Comparator<Mobile> c = new Comparator<Mobile>() {
//
//		    @Override
//		    public int compare(Mobile o1, Mobile o2) {
//		        return o1.brand.compareTo(o2.brand);
//		    }
//		};
//		```
//
//		 Because `Comparator` is a functional interface, this can be simplified to:
//
//		```
//		Comparator<Mobile> c =
//		    (o1, o2) -> o1.brand.compareTo(o2.brand);
//		```
//
//		 And even:
//
//		```
//		mobileList.sort(
//		    (o1, o2) -> o1.brand.compareTo(o2.brand)
//		);
//		```
//
//		---
//
//		 ## 🔥 Interview Questions You Should Know
//
//		 ### Q1. Why do we use Comparable?
//
//		 > To define the natural/default ordering of objects.
//
//		 ### Q2. Why do we use Comparator?
//
//		 > To define custom sorting logic externally and support multiple sorting strategies.
//
//		 ### Q3. Which method does Comparable have?
//
//		```
//		compareTo()
//		```
//
//		 ### Q4. Which method does Comparator have?
//
//		```
//		compare()
//		```
//
//		 ### Q5. Can Comparable and Comparator both be used for the same class?
//
//		 **Yes.**
//
//		 For example:
//
//		```
//		Comparable → default sorting by price
//
//		Comparator → custom sorting by brand
//		Comparator → custom sorting by model
//		```
//
//		 ### Q6. Where is the sorting logic written?
//
//		```
//		Comparable  → inside the class
//		Comparator  → outside the class
//		```
//
//		 ### Q7. Are they functional interfaces?
//
//		 **Yes.** Both have one abstract method:
//
//		```
//		Comparable  → compareTo()
//		Comparator  → compare()
//		```
//
//		 ### Q8. Which one should I use?
//
//		 Think:
//
//		 > **"Does this class have one obvious natural order?"**
//
//		 If yes → `Comparable`.
//
//		 > **"Do I need different ways to sort the same objects?"**
//
//		 Use `Comparator`.
//
//		 ### One-line memory trick 🧠
//
//		```
//		Comparable  → "I compare myself."
//		Comparator  → "Someone else compares me."
//		```
//
//		 For your examples:
//
//		```
//		Laptop implements Comparable<Laptop>
//		        ↓
//		Laptop decides its natural order
//
//		Mobile + Comparator
//		        ↓
//		External object decides how Mobile should be sorted
//		```

	}

}
