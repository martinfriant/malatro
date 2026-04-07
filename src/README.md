# MALATROcc3002 Project

## Project Description:

This code is trying to recreate a card game

### Object Domain:

To recreate this game I've contemplated this domain of traits and classes:

**domain/**:

    card/ 
    effect/
    hand/
    joker/
    score/

1. **Card(Range, Suit)**:
    
   > Card contains everything is needed to represent any *'normal'* card in the game.
   >
   > It models the entity Card by using a combination between Range, Suit and Taxonomy

   1.1 **Range(points, order, classification)**
    
      > Interface Range defines the sets of cards that appear on our game.
      > In this version the current range of cards is the following:
      >
      > [aces, 2, 3, 4, 5, 6, 7, 8, 9, J, Q, K]
        
      > Every range has its own points, order and taxonomy. 
      > Points:= Numerical value selected for the range, meant to have use when calculating scores.
      > Order:= Numerical value selected for the range. Example; (aces = 1, J = 10, Q = 11, K = 12).
      > Classification:= This is defined by the parity of the range (if it has), otherwise it sets it as a 'face_card'. 

   1.2 **Suit()**  
        
      > Suit is an Interface that defines the main categories of 'normal' cards. 
      > 
      > In this version the current possible suits are: [heart, diamond, club, spades]

2. **Effect()**:

   > The interface Effect is an abstraction of behavior given context, it serves as the engine for calculating the score. 
   >
   > Effect allows the system to:
   > - Delegate score computation
   > - Remain extensible for future rules
   > - Avoid tightly coupling logic to entities like Hand or Score
   >
   > Effect encapsulates all score-modifying logic based on the state of a hand. This includes: Multipliers, Conditional Effects given by having a specific arrange of cards, Joker effects, etc...
   
   *I decided to separate score calculation logic from the score/ module, since score is meant to represent only the result, not the process.*
   

3. **Hand():**

   > Hand represents a collection of elements that participate in a play.
   > It contains:
   >  - A collection of cards
   >  - A collection of Jokers
   > 
   > Hand serves the function of manage the elements involved in a play, and provide context for score calculation (not yet).

4. **Joker():**
   
   > Joker is an abstraction representing special entities that modify the outcome of a hand.
   > Each Joker is modeled as a distinct implementation of the Joker interface.
   > 
   > This design implies that:
   > - Every Joker is a type of Effect
   > - Each Joker encapsulates its own behavior 
   > - No conditional logic is required to differentiate Joker behavior
   >
   > In this stage Jokers are only modeled as identifiable entities, the behavior of each one its going to be implemented later independently.

5. **Score(chips, multiplier):**

   > Score is a Value Object that represents the numerical result of a play.
   > It represents the result of a scoring process, while remaining immutable and simple.


