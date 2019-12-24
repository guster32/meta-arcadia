SUMMARY = "Basic Odroid DFB graphics image"

IMAGE_FEATURES += "splash debug-tweaks tools-debug"

LICENSE = "MIT"

inherit core-image distro_features_check extrausers

# let's make sure we have a good image..
REQUIRED_DISTRO_FEATURES = " directfb"

IMAGE_INSTALL_append = " odroid-edid mali-t62x"



COMPATIBLE_MACHINE = "odroid-xu4"

