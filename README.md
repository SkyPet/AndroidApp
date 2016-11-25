Remember to create and generate abi class for binding VM. 
`abigen --abi SkyPetAbi.abi --bin SkyPet.bin --pkg SkyPet --lang java --out SkyPet.java`

Here "SkyPet.bin" is the bytecode for the smart contract.  There are some issues with this; see https://github.com/ethereum/go-ethereum/issues/3286. 

`go get github.com/tools/godep`
`$ cd $GOPATH/src/github.com/ethereum/go-ethereum`
`$ godep go install ./cmd/abigen`
