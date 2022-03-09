# we need the alphabet because we convert letters into numerical values to be
# able to use mathematical operations (note we encrypt the spaces as well)
ALPHABET = ' ABCDEFGHIJKLMNOPQRSTUVWXYZ'


def crack_caesar(cipher_text):
    # we try all the possible key values so the size of the ALPHABET
    for key in range(len(ALPHABET)):
        # reinitialize this to be an empty string
        plain_text = ''

        # we just have to make a simple caesar decryption
        for c in cipher_text:
            index = ALPHABET.find(c)
            index = (index - key) % len(ALPHABET)
            plain_text = plain_text + ALPHABET[index]

        # print the actual decrypted string with the given key
        print('With key %s, the result is: %s' % (key, plain_text))


if __name__ == '__main__':
    encrypted = input("[-] Provide the encrypted text ")
    crack_caesar(encrypted)

