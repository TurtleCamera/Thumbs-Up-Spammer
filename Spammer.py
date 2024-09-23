import pyperclip
import argparse

# Set up command-line argument parsing
parser = argparse.ArgumentParser(description="Generate a :thumbsup: emoji spam string.")
parser.add_argument("-s", "--start_counter", default=1, type=int, help="The counter to start at")
parser.add_argument("-c", "--count", default=199, type=int, help="The number of times you wish to spam the :thumbsup: emoji")

args = parser.parse_args()

start_counter = args.start_counter
count = min(args.count, 199)  # Limit to 199 emojis

# Generate the spam string
spam_messages = [f"👍 X{i}" for i in range(start_counter, start_counter + count)]

# Join the messages with commas and 'and' for the last one
spam_string = ', '.join(spam_messages[:-1]) + ', and ' + spam_messages[-1]

# Copy the generated string to the clipboard
pyperclip.copy(spam_string)

# Print confirmation
print("Copied the following to clipboard:")
print(spam_string)