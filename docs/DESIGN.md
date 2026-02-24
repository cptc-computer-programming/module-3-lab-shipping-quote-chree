# Shipping Quote Calculator

## Cost Formula

Write your cost formula (math or pseudocode). It must include:
- at least one weight-based factor
- at least one size-based factor

```java 
// base cost:
// finalCost = baseCost
//      + (weight * weightRate)
//      + (sizeFactor * sizeRate)

// sizeFactor:
// sizeFactor = Math.sqrt(length * width * height);
```
Size factor selected (choose at least one):
<!-- - sqrt(volume) -->

Brief justification (2–4 sentences):
<!-- The amount of room a box takes up is heavily important because of limited space.
this will get each size of the box allowing accurate measurements. -->
---

## Method List (at least 5)

For each method, keep it short. Include only:
- description (1 sentence)
- inputs (short list)
- output (what it returns)
- return type

Method 1: weightCost
- description: calculates the weight based cost
- inputs: weight and weightRate
- output: the weight cost
- return type: double

Method 2: sizeCost
- description: calculates the size based cost
- inputs: sizeFactor and sizeRate
- output: the size cost
- return type: double

Method 3: volume
- description: computes the volume of the package
- inputs: length, width, and height
- output: the volume of the package
- return type: double

Method 4: sqVolume
- description: calculates the square root of the volume
- inputs: volume
- output: square root of volume
- return type: double

Method 5: totalShipCost
- description: Calculates the total cost using weight and size costs
- inputs: weightCost and sizeCost
- output: the total amount of shipping cost
- return type: double
