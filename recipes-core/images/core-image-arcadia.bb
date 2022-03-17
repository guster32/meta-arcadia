SUMMARY = "Basic KMS/DRM/GBM graphics image"
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL} kmscube hello-rs glplay-rs "

#IMAGE_FEATURES += "splash debug-tweaks tools-debug package-management ssh-server-dropbear hwcodecs"
IMAGE_FEATURES += " splash"
#DISTRO_FEATURES += " opengl wayland "

# Graphics and Audio
#REQUIRED_DISTRO_FEATURES = " opengl wayland "

#CORE_IMAGE_BASE_INSTALL += " wayland htop ldd "

#SDL Test Samples
#IMAGE_INSTALL:append = " sdltutorials"

COMPATIBLE_MACHINE = "odroid-xu4|qemuarm|qemux86-64|rockpi-4-rk3399i|jetson-nano-qspi-sd"

