Remember to create and generate abi class for binding VM.  To install, clone go-ethereum.  

`$ cd $GOPATH/src/github.com/ethereum/go-ethereum
$ godep go install ./cmd/abigen`

`abigen --abi myabi.abi --pkg main --type mycontractname --out mycontractname.go`