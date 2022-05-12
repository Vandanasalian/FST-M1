user1= input("Enter Player 1 Name")
user2= input("Enter Player 2 Name")

user1_choice= input(user1 + ", do you want to choose rock, paper or scissors? ").lower()
user2_choice= input(user2 + ", do you want to choose rock, paper or scissors? ").lower()

if user1_choice == user2_choice:
    print("Its a Tie")
elif user1_choice == 'Rock':
    if user2_choice == 'scissors':
        print("Rock wins") 
    else:
	    print("Paper wins!")
elif user1_choice == 'scissors':
    if user2_choice == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
	
elif user1_choice == 'paper':
    if user2_choice == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
	
else:
	
    print("Invalid input! You have not entered rock, paper or scissors, try again.")
