Remember to create and generate abi class for binding VM.  To install, clone go-ethereum and fetch pull request 2977.  
`git fetch origin pull/2977/head:pr-2977`


`go get github.com/tools/godep`
`$ cd $GOPATH/src/github.com/ethereum/go-ethereum`
`$ godep go install ./cmd/abigen`


`~/Documents/go/bin/abigen --abi SkyPetAbi.abi --pkg com.example.dstahl.gethagain --type SkyPet --lang java --out SkyPet.java` 