# Hashing-Encryption

[![forthebadge made-with-python](http://ForTheBadge.com/images/badges/made-with-python.svg)](https://www.python.org/)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)



[![Linux](https://svgshare.com/i/Zhy.svg)](https://svgshare.com/i/Zhy.svg)
[![macOS](https://svgshare.com/i/ZjP.svg)](https://svgshare.com/i/ZjP.svg)
[![Windows](https://svgshare.com/i/ZhY.svg)](https://svgshare.com/i/ZhY.svg)
[![PyPI license](https://img.shields.io/pypi/l/ansicolortags.svg)](https://pypi.python.org/pypi/ansicolortags/)

                                                      
                                                      
                                                      Hashing and Encryption algorithms
                                                      
                                                      
                                                      

![image](https://user-images.githubusercontent.com/90950629/157904718-c9de1196-b026-4f44-9261-c5727728acfd.png)


Cryptography provides for secure communication in the presence of malicious third-parties—known as adversaries. Encryption uses an algorithm and a key to transform an input 
(i.e., plaintext) into an encrypted output (i.e., ciphertext). A given algorithm will always transform the same plaintext into the same ciphertext if the same key is used. 
Algorithms are considered secure if an attacker cannot determine any properties of the plaintext or key, given the ciphertext. 
An attacker should not be able to determine anything about a key given a large number of plaintext/ciphertext combinations which used the key.

# What is the difference between symmetric and asymmetric cryptography?

With symmetric cryptography, the same key is used for both encryption and decryption. A sender and a recipient must already have a shared key that is known to both. 
Key distribution is a tricky problem and was the impetus for developing asymmetric cryptography.

With asymmetric crypto, two different keys are used for encryption and decryption. Every user in an asymmetric cryptosystem has both a public key and a private key. 
The private key is kept secret at all times, but the public key may be freely distributed.

Data encrypted with a public key may only be decrypted with the corresponding private key. So, sending a message to John requires encrypting that message with John’s public key.
Only John can decrypt the message, as only John has his private key. Any data encrypted with a private key can only be decrypted with the corresponding public key. 
Similarly, Jane could digitally sign a message with her private key, and anyone with Jane’s public key could decrypt the signed message and verify that it was in fact 
Jane who sent it.

Symmetric is generally very fast and ideal for encrypting large amounts of data (e.g., an entire disk partition or database). 
Asymmetric is much slower and can only encrypt pieces of data that are smaller than the key size (typically 2048 bits or smaller). 
Thus, asymmetric crypto is generally used to encrypt symmetric encryption keys which are then used to encrypt much larger blocks of data. 
For digital signatures, asymmetric crypto is generally used to encrypt the hashes of messages rather than entire messages.

A cryptosystem provides for managing cryptographic keys including generation, exchange, storage, use, revocation, and replacement of the keys.



# What problems does cryptography solve?
A secure system should provide several assurances such as confidentiality, integrity, and availability of data as well as authenticity and non-repudiation.
When used correctly, crypto helps to provide these assurances. Cryptography can ensure the confidentiality and integrity of both data in transit as well as data at rest. 
It can also authenticate senders and recipients to one another and protect against repudiation.

Software systems often have multiple endpoints, typically multiple clients, and one or more back-end servers. These client/server communications take place over networks 
that cannot be trusted. Communication occurs over open, public networks such as the Internet, or private networks which may be compromised by external attackers or malicious 
insiders.

It can protect communications that traverse untrusted networks. There are two main types of attacks that an adversary may attempt to carry out on a network. Passive attacks 
involve an attacker simply listening on a network segment and attempting to read sensitive information as it travels. Passive attacks may be online (in which an attacker 
reads traffic in real-time) or offline (in which an attacker simply captures traffic in real-time and views it later—perhaps after spending some time decrypting it).
Active attacks involve an attacker impersonating a client or server, intercepting communications in transit, and viewing and/or modifying the contents before passing 
them on to their intended destination (or dropping them entirely).

The confidentiality and integrity protections offered by cryptographic protocols such as SSL/TLS can protect communications from malicious eavesdropping and tampering. 
Authenticity protections provide assurance that users are actually communicating with the systems as intended. For example, are you sending your online banking password 
to your bank or someone else?

It can also be used to protect data at rest. Data on a removable disk or in a database can be encrypted to prevent disclosure of sensitive data should the physical 
media be lost or stolen. In addition, it can also provide integrity protection of data at rest to detect malicious tampering.

# What is hashing?

Hashing is a method of cryptography that converts any form of data into a unique string of text. Any piece of data can be hashed, no matter its size or type. In traditional hashing, regardless of the data’s size, type, or length, the hash that any data produces is always the same length. A hash is designed to act as a one-way function — you can put data into a hashing algorithm and get a unique string, but if you come upon a new hash, you cannot decipher the input data it represents. A unique piece of data will always produce the same hash.

# How does it work?

Hashing is a mathematical operation that is easy to perform, but extremely difficult to reverse. (The difference between hashing and encryption is that encryption can be reversed, or decrypted, using a specific key.) The most widely used hashing functions are MD5, SHA1 and SHA-256. Some hashing processes are significantly harder to crack than others. For example, SHA1 is easier to crack than bcrypt.


Some examples of data run through SHA1 hashes. The SHA1 hashes will always be the same for this data.
Who uses hashing?

The average user encounters hashing daily in the context of passwords. For example, when you create an email address and password, your email provider likely does not save your password. Rather, the provider runs the password through a hashing algorithm and saves the hash of your password. Every time you attempt to sign in to your email, the email provider hashes the password you enter and compares this hash to the hash it has saved. Only when the two hashes match are you authorized to access your email.

# Hashing in Cryptocurrencies

In the Bitcoin blockchain, ‘mining’ is essentially conducted by running a series of SHA-256 hashing functions. In cryptocurrency blockchains today, hashing is used to write new transactions, timestamp them, and ultimately to add a reference to them in the previous block. When a block of transactions is added to the blockchain, and consensus is reached among operators of different nodes (validating that all of them have the right and true version of the entire ledger), it is nearly impossible to reverse a transaction due to the enormous computing power that would be required by anyone attempting to tamper with the blockchain, and the one-way nature of the hashing. Hashing is therefore crucial to maintain the cryptographic integrity of the blockchain.

# Hashing and Cybersecurity

When an organization discovers that a platform’s passwords have been compromised, it usually means that hackers have acquired the hashes that represent the passwords. Hackers then run the hashes of common words and combinations of common words and numbers to decipher some of the passwords that users have saved. The cybersecurity industry now uses a mechanism called ‘salting’. Salting includes adding random data to a password before hashing it, and then storing that ‘salt value’ with the hash. This process makes it harder for hackers to use pre-computation techniques and crack passwords of hashed data that they have acquired.

Cryptographic hashing has long played a role in cybersecurity, and is now poised to power the coming wave of blockchain applications.

Asymmetric-key algorithms
Also referred to as public-key algorithms, asymmetric-key algorithms use paired keys (a public and a private key) in performing their function. The public key is known to all, but the private key is controlled solely by the owner of that key pair. The private key cannot be mathematically calculated through the use of the public key even though they are cryptographically related. Asymmetric algorithms are used for:

Computing digital signatures
Establishing cryptographic keying material
Identity Management
Security Services Provided by Cryptographic Algorithms
Specific security services can be achieved by using different cryptographic algorithms. Often, a single algorithm can be used for multiple services.

Hash Functions
A hash function is often a component of many cryptographic algorithms and schemes, including digital signature algorithms, Keyed-Hash Message Authentication Codes (HMAC), key-derivation functions/methods and random number generators. A hash function operates by taking an arbitrary, but bounded length input and generating an output of fixed length. This output is often referred to as hash, hash value, message digest or digital fingerprint. FIPS180 (Secure Hash Standard) and FIPS202 (Secure Hash Algorithm-3) define the approved hash functions.

Symmetric-Key Algorithms for Encryption and Decryption
Encryption provides confidentiality of data by transforming the “plaintext” into “ciphertext.” Decryption transforms ciphertext back to plaintext. AES and 3DES are the approved symmetric-key algorithms used for encryption/decryption services. 3DES is likely to be retired in the near future.

Advanced Encryption Standard (AES)
The AES is based on the Rijndael algorithm, which was invented by Cryptomathic’s previous chief cryptographer Vincent Rijmen together with his fellow researcher Joan Daemen.  

AES encrypts and decrypts data using 128/192/256-bit keys into 128-bit blocks.

3DES / Triple DEA (TDEA)
Read White Paper
3DES is a symmetric-key block cipher which applies the DES cipher algorithm three times to each data block. The official name as used by NIST is the Triple Data Encryption Algorithm (TDEA).

TDEA encrypts and decrypts data using three 56-bit keys into 64-bit blocks. TDEA has two additional variations: 

Two-key TDEA (2TDEA) using 3 keys, however key 1 and key 3 are identical. This leads to 112 effective bits.

Three-key TDEA uses 3 different keys, leading to 168 bits. 2TDEA is widely used in the payment card industry as it provided a good trade-off of security and compute time.

However, evolving technology made it inappropriate to withstand attacks. As of December 21, 2015, 2TDEA can only be used for decryption purposes.

A comparative study (Alanazi et al., 2010), pointed out that even 3DES (also referred to as 3TDEA) is vulnerable to differential cryptanalysis.

The Advanced Encryption Standard (AES) proved itself to be much safer, being strong against differential cryptanalysis, but also against truncated differential or linear cryptanalysis as well as against interpolation and square attacks.

Modes of Operation for the application of AES and TDEA
Cryptographic modes of operation are algorithms which cryptographically transform data that features symmetric key block cipher algorithms, in this case AES and TDEA. The modes of operation solve the problems that occur with block-cipher encryption: when multiple blocks are encrypted separately within a message, that could allow an adversary to substitute individual blocks, often without detection. To alleviate this, NIST prescribes the combination of the applied algorithm with

variable initialization vectors (special data blocks used in an initial step of the encryption and in the subsequent and corresponding decryption of the message) and/or
feedback of the information that has been derived from the cryptographic operation.
Message Authentication Codes (MACs)
MACs can be used in providing authentication for the origin/source and integrity of messages. This cryptographic mechanism resolves the problem of adversaries altering messages by creating a MAC key that is shared by both the message originator and the recipient.

MACs Using Block Cipher Algorithms
This algorithm uses an approved block cipher algorithm, for example, AES or TDEA to further secure a MAC.

MACs Using Hash Functions
An approved hash function may also be used for computing a MAC.

Digital Signature Algorithms
Digital signatures are used with hash functions to provide source authentication, integrity authentication, and support for non-repudiation. The Digital Signature Algorithm (DSA), RSA algorithm and ECDSA algorithm are approved by FIPS 186 for use in generating digital signatures.

Key Establishment Schemes
Key transport and key agreement are two types of automated key establishment schemes that are used to create keys that will be used between communicating entities. The sending entity encrypts the keying material, which is then decrypted by the receiving entity.

Discrete Logarithm based Key-Agreement Schemes
Discrete logarithm based public-key algorithms rely on schemes that use finite field math or elliptic curve math. Ephemeral, static or both keys may be used in a single key-agreement transaction.

Key Establishment Using Integer-Factorization Schemes
Integer factorization based public-key algorithms are used for key establishment schemes where one party always has and uses a static key pair, while the other party may or may not use a key pair.

Security Properties of the Key-Establishment Schemes
It is not always practical for both parties to use both static and ephemeral keys with certain applications, even though using both types of keys in key-establishment schemes provides more security than schemes that use fewer keys.

Key Encryption and Key Wrapping
Key encryption further enhances the confidentiality and protection of a key by encrypting the said key. The process of key unwrapping then decrypts the ciphertext key and provides integrity verification.

Key Confirmation
Key confirmation provides assurance between two parties in a key-establishment process that common keying materials have been established.

Key Establishment Protocols
Protocols for key establishment specify the processing that is needed to establish a key along with its message flow and format.

RNGs (Random Number Generators)
RNGs are needed to generate keying material and are classified into two categories: deterministic and non-deterministic.
