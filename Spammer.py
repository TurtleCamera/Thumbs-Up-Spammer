import pyperclip

# Ask the user what counter they want to start at
while True:
    start_counter = input("Please enter the counter you want to start at: ")
    try:
        start_counter = int(start_counter)
        break
    except ValueError:
        print("Please enter a valid integer.")

# Ask the user how many times they want to spam :thumbsup:
while True:
    count = input("Please enter the number of times you wish to spam the :thumbsup: emoji: ")
    try:
        count = int(count)
        break
    except ValueError:
        print("Please enter a valid integer.")

# Generate the spam string
spam_messages = [f"👍 X{i}" for i in range(start_counter, start_counter + count)]

# Join the messages with commas and 'and' for the last one
spam_string = ', '.join(spam_messages[:-1]) + ', and ' + spam_messages[-1]

# Copy the generated string to the clipboard
pyperclip.copy(spam_string)

# Print confirmation
print("Copied the following to clipboard:")
print(spam_string)