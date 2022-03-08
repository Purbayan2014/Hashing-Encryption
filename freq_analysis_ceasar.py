import matplotlib.pylab as plt

Alphabet = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'

def frequency(usr_text):
    usr_text.upper()
    

    letter_freq = {}

    for letters in Alphabet:
        letter_freq[letters] = 0

    for letter in usr_text:
        if letter in Alphabet:
            letter_freq[letter] += 1

    return letter_freq

def plotter(frequencies):
    plt.bar(frequencies.keys(), frequencies.values())
    plt.show()


if __name__== "__main__":

    text  = input("[-] Provid the text ")

    frq = frequency(text)

    plotter(frq) 




