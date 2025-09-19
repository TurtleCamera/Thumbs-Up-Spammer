import pyperclip
import argparse
import pickle
import os

STATE_FILE = "thumbsup_state.pkl"

# Set up command-line argument parsing
parser = argparse.ArgumentParser(description="Generate a :thumbsup: emoji spam string.")
parser.add_argument("-s", "--start_counter", type=int, help="The counter to start at.")
parser.add_argument("-c", "--count", type=int, help="The number of times you wish to spam the :thumbsup: emoji.")
parser.add_argument("-u", "--unicode", action="store_true", help="Use unicode superscript to make the text smaller.")
parser.add_argument("-p", "--pyramid", action="store_true", help="Continue from last state with count + 1 (pyramid mode).")

args = parser.parse_args()

# Load previous state if it exists and the user used the pyramid flag
if args.pyramid:
    if os.path.exists(STATE_FILE):
        with open(STATE_FILE, "rb") as f:
            last_state = pickle.load(f)
            args.start_counter = last_state["last_counter"] + 1
            args.count = last_state["count"] + 1
    else:
        print("No previous state found for pyramid mode. Starting fresh.")
        args.start_counter = 1
        args.count = 1

# Apply defaults
start_counter = args.start_counter if args.start_counter is not None else 1
count = args.count if args.count is not None else (199 if not args.unicode else 198)

# Respect maximum limits
count = min(count, 198 if args.unicode else 199)

# Generate the spam string
if args.unicode:
    superscripts = str.maketrans("0123456789", "⁰¹²³⁴⁵⁶⁷⁸⁹")

    def to_superscript(num):
        return str(num).translate(superscripts)

    spam_messages = [f"👍 ˣ{to_superscript(i)}" for i in range(start_counter, start_counter + count)]
    spam_string = ", ".join(spam_messages[:-1]) + ", and " + spam_messages[-1]
    spam_string = "-# " + spam_string
else:
    spam_messages = [f"👍 X{i}" for i in range(start_counter, start_counter + count)]
    spam_string = ", ".join(spam_messages[:-1]) + ", and " + spam_messages[-1]

# Copy to clipboard
pyperclip.copy(spam_string)

# Save state if both -s and -c were provided
if args.start_counter is not None and args.count is not None:
    new_state = {
        "last_counter": start_counter + count - 1,
        "count": count,
    }
    with open(STATE_FILE, "wb") as f:
        pickle.dump(new_state, f)

# Print confirmation
print("Copied the following to clipboard:")
print(spam_string)
