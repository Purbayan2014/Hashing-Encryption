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


def crack(ciph_text):
    freq = frequency(ciph_text)
   # plotter(freq)
    freq = sorted(freq.items(), key = lambda x: x[1], reverse=True)
    # if lambda x: x[0] then it would have sorted
    # based on the values of the items but not the values of the  dict
    print(" The possible key value: %s" % (Alphabet.find(freq[0][0])-Alphabet.find('E')))


if __name__== "__main__":

    text  = input("[-] Provid the text to crack --- > ").upper()
    crack(text)



