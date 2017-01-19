# Install H2O Deep Water

To install H2O Deep Water, there are two options available:  

- Use provided pre-compiled files 
- Build from source. 

Note that compiling from source will provide the latest or specific version of H2O Deep Water.



The C++ compiler must have C++11 support. 

  - Verify that the version of the existing g++ is less than 5.3: ``$ g++ -v``

  
  - Select appropriate gcc and g++ version using alternatives:
		
	
### MXNET

1. Update third party dependencies:

		$ cd ~/deepwater
		# add the path to CUDA library to link and compile flag
		
		# whether use cuda runtime compiling for writing kernels in native language (i.e. Python)
		# whether use opencv during compilation

		$ make -j8
		

### MXNet Python Module
		$ cd ~/deepwater/thirdparty/mxnet/python

### MXNet R Package


		> install.packages("shiny")


		> library("mxnet")

1. Get version 3.0 protocol buffers. This assumes you will download and place the file to the protobuf directory made during setup.
		$ wget https://github.com/google/protobuf/releases/download/v3.0.0/protoc-3.0.0-linux-x86 64.zip
		

		export PATH="$PATH:$HOME/protobuf/bin"

		
### TensorFlow Python Module

The TensorFlow Python module is required to create arbitrary graphs using the Python API. The module
(See [https://www.tensorflow.org/get_started/os_setup](https://www.tensorflow.org/get_started/os_setup)). Otherwise, you will need to build a Python module for the specific version of TensorFlow. The following are the instructions to build the Python module for TensorFlow 0.10 with CUDA 8. Please update the instructions accordingly with you specific versions.

1. Clone the TensorFlow repository: ``$ git clone https://github.com/tensorflow/tensorflow``



		$ ./

		
		cxx builtin include directory: ``/usr/local/cuda-8.0/include''
		
7. Install the Python module. If you are using a particular environment (virtual environment), please be sure you are in that environment. The exact name of the wheel file will depend on your platform.

### Build Deep Water Jar File

1. Remove TensorFlow from the build process: Modify the following files using your editor of choice.


		build/libs/deepwater-all.jar
		
### H2O with Deep Water

1. Clone the H2O repository: 

		$ git clone https://github.com/h2oai/h2o-3.git

