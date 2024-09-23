import pyperclip
import argparse

# Set up command-line argument parsing
parser = argparse.ArgumentParser(description="Generate a :thumbsup: emoji spam string.")
parser.add_argument("-s", "--start_counter", default=1, type=int, help="The counter to start at.")
parser.add_argument("-c", "--count", default=199, type=int, help="The number of times you wish to spam the :thumbsup: emoji.")
parser.add_argument("-u", "--unicode", action="store_true", help="Use unicode superscript to make the text smaller.")

args = parser.parse_args()

start_counter = args.start_counter
use_unicode = args.unicode
count = min(args.count, 198 if use_unicode else 199)  # Limit to 199 emojis if normal and 198 if unicode

print(use_unicode)

# Generate the spam string with or without superscripted counter
if use_unicode:
    # Unicode superscripts for numbers 0-9
    superscripts = str.maketrans('0123456789', '⁰¹²³⁴⁵⁶⁷⁸⁹')

    # Function to convert a number to superscript
    def to_superscript(num):
        return str(num).translate(superscripts)
    
    # Create the :thumbsup: emojis with counters
    spam_messages = [f"👍 ˣ{to_superscript(i)}" for i in range(start_counter, start_counter + count)]

    # Join the messages with commas and 'and' for the last one
    spam_string = ', '.join(spam_messages[:-1]) + ', and ' + spam_messages[-1]

    # Append "-#" to make it appear smaller on Discord
    spam_string = "-# " + spam_string
else:
    # Create the :thumbsup: emojis with counters
    spam_messages = [f"👍 X{i}" for i in range(start_counter, start_counter + count)]

    # Join the messages with commas and 'and' for the last one
    spam_string = ', '.join(spam_messages[:-1]) + ', and ' + spam_messages[-1]

# Copy the generated string to the clipboard
pyperclip.copy(spam_string)

# Print confirmation
print("Copied the following to clipboard:")
print(spam_string)