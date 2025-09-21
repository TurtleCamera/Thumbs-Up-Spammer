# 👍 Spammer

A simple Python CLI that generates spam strings of the `:thumbsup:` emoji.  
This was made just for fun (e.g., sending to friends on Discord who are okay with it).

---


## Usage

Run the script like this:

```bash
python Spammer.py [options]
```

---

## Options

| Flag | Long Option       | Type   | Description                                                                                                                                                              |
| ---- | ----------------- | ------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `-s` | `--start_counter` | `int`  | The counter to start at. Example: `-s 1` starts numbering at 1.                                                                                                          |
| `-c` | `--count`         | `int`  | Number of times to output the `:thumbsup:` emoji (per run). Example: `-c 5`.                                                                                             |
| `-u` | `--unicode`       | `flag` | Use Unicode superscript characters to make the counter text smaller. No value required; include the flag to enable.                                                      |
| `-p` | `--pyramid`       | `flag` | Pyramid mode — on each run the script continues from the last state with `count + 1` (creates a growing pyramid pattern). No value required; include the flag to enable. |

---

## Example commands

Spam 5 thumbs up (no custom start counter — defaults apply):

```bash
python Spammer.py -c 5
```

Start counting at 1 and spam 5 thumbs up (explicit start counter):

```bash
python Spammer.py -s 1 -c 5
```

Spam 10 thumbs up using Unicode superscript for the counter (smaller counter text):

```bash
python Spammer.py -c 10 -u
```

Build a thumbs-up pyramid of 5 levels (pyramid mode):

```bash
python Spammer.py -p -c 5
```

Start at counter 3, spam 4 thumbs up, and use superscript formatting:

```bash
python Spammer.py -s 3 -c 4 -u
```

Example of combining pyramid + unicode (create a visually smaller, growing pyramid):

```bash
python Spammer.py -p -c 6 -u
```

---

## ⚠️ Disclaimer

This script is meant for lighthearted use only. Do **not** use it to harass, spam strangers, or break the rules of any platform. Only send to people or servers where it's welcome.

---

If you want, I can add a **sample output** section showing plain, unicode, and pyramid examples — want that included?
