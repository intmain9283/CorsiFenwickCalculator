# CorsiFenwickCalculator
A simple calculator to determine Corsi/Fenwick.

Corsi and Fenwick are advanced staticstics used in hockey to help determine puck possession.  They are both similar in calculation, except for one difference. Corsi uses Shots, Blocked Shots, and Missed Shots; but Fenwick uses all except Blocked Shots.  They are split into two categories: For and Against.  In order to calculate Corsi For, you add up all the player's Shots, Blocked Shots, and Missed Shots that player generated. In order to calculate Corsi Against, you add up all the opponent's Shots, Blocked Shots, and Missed Shots that were generated while that player was on the ice.  Fenwick For and Against are the exact same, minus using Blocked Shots.  

In order to find out the Corsi or Fenwick number, you subtract the Against from the For.  For example, Player A on Team A had 5 shots, 3 shots blocked, and 4 missed shots while on the ice.  Team B had 3 shots, 4 shots blocked, and 2 missed shots while Player A was on the ice.  Player A's Corsi For would be 5 + 3 + 4 = 12 and his Corsi Against would be 3 + 4 + 2 = 9. His Corsi would be 3.  His Fenwick would be (5 + 4) - (3-2) = 8.  

With this application, you don't have to worry about the calculation.  You just add or subtract numbers as you please and the Corsi and Fenwick numbers update automatically.


*NOTE: This is a very basic calculation of Corsi and Fenwick and is only used to help explain how Corsi and Fenwick work.  A more accurate depiction of puck possession would be Corsi/Fenwick REL, which takes a player's Corsi/Fenwick and compares it to his teammates' Corsi/Fenwick.
